/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

public class Bank {
	public static void main(String[] args) {
		AccountManager accmg = new AccountManager(5);
		try {
			accmg.addAccount("Soham Dutta", 9000);
			accmg.addAccount("Chintan Jana", 11000);
			accmg.addAccount("Roheena Pal", 12000);
			accmg.addAccount("Shruti Roy", 10000);
			accmg.addAccount("Ananya Pal", 13500);

			accmg.printAllAccountDetails();

			accmg.deleteAccount(1002);
			System.out.println("Account Deleted With Account Number 1002.");
			accmg.addAccount("Ujaan Dutta", 8000);
			System.out.println("Account Created With Owner's Name Ujaan Dutta And Initial Balance 8000.00$.");

			accmg.printAllAccountDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
