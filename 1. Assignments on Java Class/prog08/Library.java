import java.util.Formatter;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] newBooks = new Book[this.books.length + 1];
        for (int i = 0; i < this.books.length; i++) {
            newBooks[i] = this.books[i];
        }
        newBooks[this.books.length] = book;
        this.books = newBooks;
    }

    public void removeBook(Book book) {
        Book[] newBooks = new Book[this.books.length - 1];
        int j = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (!this.books[i].equals(book)) {
                newBooks[j] = this.books[i];
                j++;
            }
        }
        this.books = newBooks;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Book book : this.books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public void printAllBooks() {

        // Table headers
        System.out.println("-".repeat(116));
        System.out.printf("| %-40s | %-20s | %-6s | %-9s | %-25s |\n",
                "Title", "Author(s)", "Pages", "Price", "Publisher");
        System.out.println("-".repeat(116));

        // Print book details
        for (Book book : books) {
            Formatter formatter = new Formatter();
            String[] authors = book.getAuthors();
            for (int i = 0; i < authors.length; i++) {
                formatter.format("%s", authors[i]);
                if (i < authors.length - 1) {
                    formatter.format(", ");
                }
            }

            System.out.printf("| %-40s | %-20s | %6d | $%8.2f | %-25s |\n",
                    book.getTitle(), formatter, book.getNumPages(), book.getPrice(), book.getPublisher());
        }

        System.out.println("-".repeat(116));
    }
}
