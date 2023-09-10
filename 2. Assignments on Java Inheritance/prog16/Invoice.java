class Invoice {
	private InventoryBookDetails ibd;
	private int bookCount;

	public Invoice(InventoryBookDetails ibd, int bookCount) {
		this.ibd = ibd;
		this.bookCount = bookCount;
	}

	public void printBill() {
		System.out.println("\n------------- Invoice -------------");
		System.out.println(String.format("| %-20s: %s", "Book Name", ibd.getBookTitle()));
		System.out.println(String.format("| %-20s: %s", "Author Name", ibd.getAuthorName()));
		System.out.println(String.format("| %-20s: $%.2f", "Price per Copy", ibd.getBookPrice()));
		System.out.println(String.format("| %-20s: %d", "Quantity", bookCount));
		double totalPrice = ibd.getBookPrice() * bookCount;
		System.out.println("------------------------------------");
		System.out.println(String.format("| %-20s: $%.2f", "Total Amount", totalPrice));
		System.out.println("------------------------------------\n");
	}

}
