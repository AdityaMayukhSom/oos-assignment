public class Book {
	String bookTitle;
	String authorName;
	String publisher;
	double price;

	Book(String bookTitle, String authorName, String publisher, double price) {
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisher = publisher;
		this.price = price;
	}

	Book(Book obj){
		this.bookTitle = obj.bookTitle;
		this.authorName = obj.authorName;
		this.publisher = obj.publisher;
		this.price = obj.price;
	}

	public String getBookTitle() {
		return this.bookTitle;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(final double newPrice) {
		this.price = newPrice;
	}
}
