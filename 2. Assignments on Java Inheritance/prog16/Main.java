/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

import java.util.Scanner;

public class Main {

	public static String convertToTitleCaseIteratingChars(String text) {

		if (text == null || text.isEmpty()) {

			return text;
		}

		StringBuilder converted = new StringBuilder();

		boolean convertNext = true;
		for (char ch : text.toCharArray()) {

			if (Character.isSpaceChar(ch)) {

				convertNext = true;
			} else if (convertNext) {

				ch = Character.toTitleCase(ch);
				convertNext = false;
			} else {

				ch = Character.toLowerCase(ch);
			}
			converted.append(ch);
		}

		return converted.toString();
	}

	public static void main(String args[]) {
		BookStore store = new BookStore(10);

		InventoryBookDetails bookDetails1 = new InventoryBookDetails(
				"The Power of Now",
				"Eckhart Tolle",
				"New World Library",
				14.99,
				5);

		InventoryBookDetails bookDetails2 = new InventoryBookDetails(
				"The Four Agreements",
				"Don Miguel Ruiz",
				"Amber-Allen Publishing",
				11.99,
				1);

		InventoryBookDetails bookDetails3 = new InventoryBookDetails(
				"Big Magic: Creative Living Beyond Fear",
				"Elizabeth Gilbert",
				"Riverhead Books",
				9.99,
				2);
		InventoryBookDetails bookDetails4 = new InventoryBookDetails(
				"The Alchemist",
				"Paulo Coelho",
				"HarperOne",
				12.99,
				3);

		InventoryBookDetails bookDetails5 = new InventoryBookDetails(
				"The Untethered Soul: The Journey Beyond Yourself",
				"Michael A. Singer",
				"New Harbinger Publications",
				13.99,
				4);

		InventoryBookDetails bookDetails6 = new InventoryBookDetails(
				"The Celestine Prophecy",
				"James Redfield",
				"Grand Central Publishing",
				10.99,
				2);

		try {
			store.addBook(bookDetails1);
			store.addBook(bookDetails2);
			store.addBook(bookDetails3);
			store.addBook(bookDetails4);
			store.addBook(bookDetails5);
			store.addBook(bookDetails6);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		while (true) {
			store.printBooks();
			System.out.print("Enter Book Title :: ");
			String title = sc.nextLine();

			title = convertToTitleCaseIteratingChars(title);
			System.out.print("Enter Author Name :: ");

			String author = sc.nextLine();
			author = convertToTitleCaseIteratingChars(author);

			InventoryBookDetails res = store.getBookDetails(title, author);
			if (res == null) {
				System.out.println("Book not found.");
			} else {
				System.out.println("No of Copies Available :: " + res.getCopyCount());
				System.out.print("No of Copies Required :: ");
				int count = sc.nextInt();
				sc.nextLine();

				if (count <= res.getCopyCount()) {
					Invoice invo = store.buyBook(title, author, count);
					invo.printBill();
				} else {
					System.out.println("Required copies not in stock.");
				}
			}

			System.out.print("Would you like to purchase more books (yes/no)? ");
			String choice = sc.nextLine();
			if (choice.toLowerCase().equals("no")) {
				break;
			}
		}
		sc.close();
	}
}
