public class InventoryBookDetails {
	private Book book;
	private int numberOfCopies;

	public InventoryBookDetails(final Book book, final int numberOfCopies) {
		this.book = book;
		this.numberOfCopies = numberOfCopies;
	}

	public InventoryBookDetails(final String bookTitle, final String authorName, final String publisher,
			final double price, final int numberOfCopies) {
		this.book = new Book(bookTitle, authorName, publisher, price);
		this.numberOfCopies = numberOfCopies;
	}

	public void changePrice(final double newPrice) {
		this.book.setPrice(newPrice);
		return;
	}

	public void addNewCopies(final int newCopyCount) {
		this.numberOfCopies += newCopyCount;
		return;
	}

	public int getCopyCount() {
		return this.numberOfCopies;
	}

	public void removeCopies(final int removeCopyCount) {
		if (this.numberOfCopies < removeCopyCount) {
			throw new Error("Not enough copies to remove.");
		}
		this.numberOfCopies -= removeCopyCount;
		return;
	}

	public String getBookTitle() {
		return this.book.getBookTitle();
	}

	public String getAuthorName() {
		return this.book.getAuthorName();
	}

	public double getBookPrice() {
		return this.book.getPrice();
	}

	public String getPublisher() {
		return this.book.getPublisher();
	}

	/**
	 * this function returns a copy of the book and inventory and keeps the original
	 * intact
	 */
	/**
	 * any modification to the book or inventory returned from this function will
	 * not be reflected in the inventory
	 */
	public InventoryBookDetails getInventoryCopy() {
		return new InventoryBookDetails(new Book(this.book), this.numberOfCopies);
	}
}
