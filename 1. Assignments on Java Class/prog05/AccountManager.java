public class AccountManager {
	private final int totalAccountsNumber;
	private int currentAccountsNumber;
	private BankAccount[] accounts;

	public AccountManager(final int totalAccountsNumber) {
		this.totalAccountsNumber = totalAccountsNumber;
		this.currentAccountsNumber = 0;
		this.accounts = new BankAccount[totalAccountsNumber];
	}

	private int findAccountPosition(final int accountNumber) {
		int accountPosition = -1;
		for (int i = 0; i < this.currentAccountsNumber; i++) {
			if (accounts[i].getAccountNumber() == accountNumber) {
				accountPosition = i;
				break;
			}
		}
		return accountPosition;
	}

	public int addAccount(final String ownerName) throws Exception {
		try {
			int numberOfAccounts = addAccount(ownerName, 0);
			return numberOfAccounts;
		} catch (Exception e) {
			throw e;
		}
	}

	public int addAccount(final String ownerName, final double initialBalance) throws Exception {
		if (currentAccountsNumber == totalAccountsNumber) {
			throw new Exception("account manager cannot handle more accounts");
		}

		try {
			accounts[currentAccountsNumber] = new BankAccount(ownerName, initialBalance);
			// after an account is created, the currentAccountsNumber is increased by one
			// the n'th account is stored inside (n-1)th index in the accounts array
			currentAccountsNumber++;
			return currentAccountsNumber;
		} catch (Exception e) {
			throw e;
		}
	}

	public void deleteAccount(final int accountNumber) throws Exception {
		int deletedAccountPosition = findAccountPosition(accountNumber);
		if (deletedAccountPosition == -1) {
			throw new Exception("account not found");
		}

		for (int i = deletedAccountPosition + 1; i < currentAccountsNumber; i++) {
			accounts[i - 1] = accounts[i];
		}

		accounts[currentAccountsNumber - 1] = null;
		currentAccountsNumber--;
	}

	public double depositIntoAccount(final int accountNumber, final double amount) throws Exception {
		int depositAccountPosition = findAccountPosition(accountNumber);

		if (depositAccountPosition == -1) {
			throw new Exception("account not found");
		}

		try {
			double currentBalance = accounts[depositAccountPosition].deposit(amount);
			return currentBalance;
		} catch (Exception e) {
			throw e;
		}
	}

	public double withdrawFromAccount(final int accountNumber, final double amount) throws Exception {
		int withdrawAccountPosition = findAccountPosition(accountNumber);

		if (withdrawAccountPosition == -1) {
			throw new Exception("account not found");
		}

		try {
			double currentBalance = accounts[withdrawAccountPosition].withdraw(amount);
			return currentBalance;
		} catch (Exception e) {
			throw e;
		}
	}

	public void printAllAccountDetails() {
		System.out.println("\n-------- Printing Account Details --------");
		for (int i = 0; i < currentAccountsNumber; i++) {
			accounts[i].printAccountDetails();
		}
		System.out.println();
	}
}
