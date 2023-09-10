import java.time.LocalDate;

public class Library {
	private int publicationCount;
	private int maxPublications;
	private Publication[] publicationList;

	public Library(int maxPublications) {
		this.maxPublications = maxPublications;
		this.publicationCount = 0;
		this.publicationList = new Publication[maxPublications];
	}

	public void addPublication(Publication publication) {
		if (publicationCount < maxPublications) {
			publicationList[publicationCount] = publication;
			publicationCount++;
		} else {
			System.err.println("Library is already full. Cannot add more publications.");
		}
	}

	public void removeBook(String title, String author) {
		boolean found = false;
		for (int i = 0; i < publicationCount; i++) {
			if (publicationList[i] instanceof Book) {
				Book book = (Book) publicationList[i];
				if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
					found = true;
					// Shift remaining publications to fill the gap
					for (int j = i; j < publicationCount - 1; j++) {
						publicationList[j] = publicationList[j + 1];
					}
					publicationList[publicationCount - 1] = null;
					publicationCount--;
					System.out.println("Book removed successfully.");
					break;
				}
			}
		}

		if (!found) {
			throw new IllegalArgumentException("Book not found in the library.");
		}
	}

	public void removeJournal(String title, LocalDate publishingDate) {
		boolean found = false;
		for (int i = 0; i < publicationCount; i++) {
			if (publicationList[i] instanceof Journal) {
				Journal journal = (Journal) publicationList[i];
				if (journal.getTitle().equals(title) && journal.getPublishingDate().equals(publishingDate)) {
					found = true;
					// Shift remaining publications to fill the gap
					for (int j = i; j < publicationCount - 1; j++) {
						publicationList[j] = publicationList[j + 1];
					}
					publicationList[publicationCount - 1] = null;
					publicationCount--;
					System.out.println("Journal removed successfully.");
					break;
				}
			}
		}

		if (!found) {
			throw new IllegalArgumentException("Journal not found in the library.");
		}
	}

	public void printPublications() {
		int bookHyphenCount = 109;
		int journalHyphenCount = 92;

		System.out.println("Books:");
		System.out.println("-".repeat(bookHyphenCount));
		System.out.printf("| %-8s | %-30s | %-20s | %-25s | %-10s |\n",
				"Type",
				"Title",
				"Author",
				"Publisher",
				"Price ($)");
		System.out.println("-".repeat(bookHyphenCount));

		// Print Books
		for (int i = 0; i < publicationCount; i++) {
			if (publicationList[i] instanceof Book) {
				Book book = (Book) publicationList[i];
				book.printDetails();
			}
		}
		System.out.println("-".repeat(bookHyphenCount));

		// Print Journals
		System.out.println("\nJournals:");

		System.out.println("-".repeat(journalHyphenCount));
		System.out.printf("| %-8s | %-20s | %-18s | %-20s | %-10s |\n",
				"Type",
				"Title",
				"Publishing Date",
				"Publisher",
				"Price ($)");
		System.out.println("-".repeat(journalHyphenCount));
		for (int i = 0; i < publicationCount; i++) {
			if (publicationList[i] instanceof Journal) {
				Journal journal = (Journal) publicationList[i];
				journal.printDetails();
			}
		}
		System.out.println("-".repeat(journalHyphenCount));
	}

}
