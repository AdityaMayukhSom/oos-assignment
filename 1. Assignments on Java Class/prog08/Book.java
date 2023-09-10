
public class Book {
    private String title;
    private String[] authors;
    private int numPages;
    private double price;
    private String publisher;

    public Book(String title, String[] authors, int numPages, double price, String publisher) {
        this.title = title;
        this.authors = authors;
        this.numPages = numPages;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }
}

