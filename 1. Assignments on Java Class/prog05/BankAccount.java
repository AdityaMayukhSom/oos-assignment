public class BankAccount {
	private static int accountNumberCounter = 1000;

	private final int accountNumber;
	private final String ownerName;
	private double balance;

	public BankAccount(final String ownerName) throws Exception {
		if (ownerName.equals("")) {
			throw new Exception("owner name cannot be empty");
		}

		accountNumberCounter++;
		this.accountNumber = accountNumberCounter;
		this.ownerName = ownerName;
		this.balance = 0;
	}

	public BankAccount(final String ownerName, final double initialBalance) throws Exception {
		if (initialBalance < 0) {
			throw new Exception("initial balance cannot be negative");
		}

		if (ownerName.equals("")) {
			throw new Exception("owner name cannot be empty");
		}

		accountNumberCounter++;
		this.accountNumber = accountNumberCounter;
		this.ownerName = ownerName;
		this.balance = initialBalance;
	}

	public double deposit(final double amount) throws Exception {
		if (amount < 0) {
			throw new Exception("deposit amount can not be negative");
		}

		balance += amount;
		return balance;
	}

	public double withdraw(final double amount) throws Exception {
		if (amount < 0) {
			throw new Exception("withdraw amount can not be negative");
		}

		if (balance < amount) {
			throw new Exception("insufficient balance");
		}

		balance -= amount;
		return balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void printAccountDetails() {
		System.out.println("| Acc No. ::\t" + accountNumber + " | Owner Name :: " + String.format("%16s", ownerName)
				+ " | Balance :: "
				+ String.format("%10.2f$ |", balance));
	}
}
