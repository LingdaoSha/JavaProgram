class BankAccount
{

	private double balance;

	public BankAccount (double openingBalance)
	{
		balance = opeingBalance;
	}

	public void deposit (double amount)
	{
	    balance = balance + amount;	
	}

	public void withdraw (double amount)
	{
		balance = balance - amount;
	}

	public void display ()
	{
		System.out.println("balance=" + balance);
	}
}