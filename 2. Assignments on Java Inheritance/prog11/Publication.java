abstract class Publication {
	protected int numberOfPages;
	protected double price;
	protected String publisherName;

	public Publication(final int numberOfPages, final double price, final String publisherName) {
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}

	abstract public void printDetails();
}
