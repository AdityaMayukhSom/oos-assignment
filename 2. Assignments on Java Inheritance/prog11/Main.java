/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addPublication(new Book(
                "The Hobbit",
                "J.R.R. Tolkien",
                200,
                129.99,
                "Allen & Unwin"));
        library.addPublication(new Book(
                "Pride and Prejudice",
                "Jane Austen",
                400,
                399.99,
                "T. Egerton, Whitehall"));

        library.addPublication(new Book(
                "The Chronicles of Narnia",
                "C.S. Lewis",
                350,
                199.30,
                "HarperCollins"));
        library.addPublication(new Journal(
                "Nature",
                LocalDate.of(2022, 10, 15),
                60,
                49.50,
                "Springer"));
        library.addPublication(new Journal(
                "The Lancet",
                LocalDate.of(2022, 9, 20),
                50,
                69.00,
                "Elsevier"));

        library.printPublications();

    }
}
