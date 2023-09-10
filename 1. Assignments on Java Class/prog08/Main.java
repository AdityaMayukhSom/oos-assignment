/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Harry Potter and the Sorcerer's Stone",
                new String[] { "J.K. Rowling" },
                320,
                99.99,
                "Bloomsbury Publishing");
        Book book2 = new Book(
                "The Lord of the Rings",
                new String[] { "J.R.R. Tolkien" },
                1178,
                249.99,
                "George Allen & Unwin");
        Book book3 = new Book(
                "Moby-Dick",
                new String[] { "Herman Melville" },
                635,
                149.99,
                "Richard Bentley");
        Book book4 = new Book(
                "The Chronicles of Narnia",
                new String[] { "C.S. Lewis" },
                768,
                199.99,
                "Geoffrey Bles");
        Book book5 = new Book(
                "To the Lighthouse",
                new String[] { "Virginia Woolf" },
                209,
                89.99,
                "Hogarth Press");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.printAllBooks();

        double totalPrice = library.getTotalPrice();
        System.out.println("\nAggregate value of all the books is calculated at $"
                + String.format("%.2f", totalPrice) + ".");
    }
}
