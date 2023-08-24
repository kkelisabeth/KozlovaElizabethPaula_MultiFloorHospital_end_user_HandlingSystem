
public class HospitalFinancial_Accounts extends Hospital{

	protected String accountNumber;
	protected double accountBalance; 
	protected String transactions = ""; 
	
	HospitalFinancial_Accounts()
	{
		accountNumber = "AccountNumber_Unknown"; 
		accountBalance = 0.00; 
	}
	
	HospitalFinancial_Accounts(String number)
	{
		accountNumber = number; 
		accountBalance = 0.00; 
	}
	
	HospitalFinancial_Accounts(String number, double balance)
	{
		accountNumber = number; 
		accountBalance = balance; 
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void addTransaction(String transaction)
	{
		transactions += "\nTransaction: " + transaction; 
	}
	
	public void addTransaction(String transaction, String transactionDetails)
	{
		transactions += "\nTransaction: " + transaction + "\nTransaction Details: " + transactionDetails; 
	}
	
	public String getTransactionHistory()
	{
		return transactions; 
	}
}
