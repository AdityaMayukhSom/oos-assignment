public class BookStore {
	private int bookCount;
	private InventoryBookDetails[] bookList;
	private final int maxBookCapacity;

	public BookStore(final int maxBookCapacity) {
		this.maxBookCapacity = maxBookCapacity;
		this.bookCount = 0;
		this.bookList = new InventoryBookDetails[maxBookCapacity];
	}

	private int findBook(String bookTitle, String authorName) {
		int pos = -1;
		for (int i = 0; i < bookCount; i++) {
			String currBookTitle = bookList[i].getBookTitle();
			String currAuthorName = bookList[i].getAuthorName();
			if (bookTitle.equalsIgnoreCase(currBookTitle) && authorName.equalsIgnoreCase(currAuthorName)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	/** returns a copy of the book details if book exists, else return null */
	public InventoryBookDetails getBookDetails(String bookTitle, String authorName) {
		int bookIndex = findBook(bookTitle, authorName);
		if (bookIndex == -1) {
			return null;
		} else {
			return bookList[bookIndex].getInventoryCopy();
		}
	}

	public Invoice buyBook(String bookTitle, String authorName, int bookCount) {
		InventoryBookDetails res = getBookDetails(bookTitle, authorName);
		if (res == null) {
			throw new Error("book not found");
		}

		if (res.getCopyCount() < bookCount) {
			throw new Error("required number of copies not in stock");
		}

		removeBookCopies(bookTitle, authorName, bookCount);
		return new Invoice(res, bookCount);
	}

	public void addBook(InventoryBookDetails book) {
		if (findBook(book.getBookTitle(), book.getAuthorName()) != -1) {
			System.out.println("book already exists");
			System.out.println("to increase number of available books, use addBook instead");
			throw new Error("book already exists");
		}

		if (this.bookCount == this.maxBookCapacity) {
			System.out.println("bookstore max capacity reached");
			throw new Error("bookstore maximum capacity reached");
		}
		this.bookCount++;
		this.bookList[bookCount - 1] = book;
	}

	public void removeBookCopies(String bookTitle, String authorName, int bookCount) {
		int bookPos = findBook(bookTitle, authorName);
		bookList[bookPos].removeCopies(bookCount);
		return;
	}

	public void printBooks() {
		int hyphenCount = 129;

		System.out.println("----- Available Books -----");
		System.out.println("-".repeat(hyphenCount));
		System.out.println(
				String.format("| %-40s | %-20s | %-30s | %-9s | %-14s |",
						"Book Title",
						"Author Name",
						"Publisher",
						"Price ($)",
						"No. Of Copies"));
		System.out.println("-".repeat(hyphenCount));

		for (int i = 0; i < bookCount; i++) {
			InventoryBookDetails book = bookList[i];
			String title = trimString(book.getBookTitle(), 40);
			String author = trimString(book.getAuthorName(), 20);
			String publisher = trimString(book.getPublisher(), 30);
			double price = book.getBookPrice();
			int numberOfCopies = book.getCopyCount();

			System.out.println(String.format("| %-40s | %-20s | %-30s | %-9.2f |  %13d |",
					title,
					author,
					publisher,
					price,
					numberOfCopies));
		}
		System.out.println("-".repeat(hyphenCount));
	}

	private String trimString(String text, int maxLength) {
		if (text.length() <= maxLength) {
			return text;
		} else {
			return text.substring(0, maxLength - 3) + "...";
		}
	}

}
