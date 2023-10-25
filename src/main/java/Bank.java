import java.util.HashMap;

public class Bank {
	private HashMap<String, Account> openedAccounts;

	public Bank() {
		openedAccounts = new HashMap<String, Account>();
	}

	public void addAccount(String accountID, Account account) {
		openedAccounts.put(accountID, account);
	}

	public HashMap<String, Account> getOpenedAccounts() {
		return openedAccounts;
	}

	public Account retrieveAccount(String identificationNumber) {
		return openedAccounts.get(identificationNumber);
	}

	public void modifyAccountBalance(String identificationNumber, double amount, String operation) {
		Account account = retrieveAccount(identificationNumber);
		if (account == null) {
			System.out.println("account not found");
		} else {
			account.modifyBalance(amount, operation);
		}
	}

}