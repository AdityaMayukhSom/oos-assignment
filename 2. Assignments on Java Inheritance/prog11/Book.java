class Book extends Publication {
	private String title;
	private String author;

	public Book(final String title, final String author, final int numberOfPages, final double price,
			final String publisherName) {
		super(numberOfPages, price, publisherName);
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void printDetails() {
		System.out.printf("| %-8s | %-30s | %-20s | %-25s | %10.2f |\n",
				"Book",
				this.title,
				this.author,
				this.publisherName,
				this.price);
	}
}
