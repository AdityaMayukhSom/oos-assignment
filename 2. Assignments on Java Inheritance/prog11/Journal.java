import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Journal extends Publication {
	private String title;
	private LocalDate publishingDate;

	public Journal(
			final String title,
			final LocalDate publishingDate,
			final int numberOfPages,
			final double price,
			final String publisherName) {
		super(numberOfPages, price, publisherName);
		this.title = title;
		this.publishingDate = publishingDate;
	}

	public String getTitle() {
		return title;
	}

	public LocalDate getPublishingDate() {
		return publishingDate;
	}

	@Override
	public void printDetails() {
		String formattedDate = publishingDate.format(DateTimeFormatter.ofPattern("dd MMM, yyyy"));

		System.out.printf("| %-8s | %-20s | %-18s | %-20s | %10.2f |\n",
				"Journal",
				title,
				formattedDate,
				publisherName,
				price);

	}
}
