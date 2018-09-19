class SavAccount
{
	private int accno;
	private String name;
	private double balance;
	private static double int_rate;
	static
	{
		int_rate=4.3;
	}
	public SavAccount()
	{
	}
	public SavAccount(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	public void display()
	{
		System.out.println("Acc No = "+accno);
		System.out.println("Name = "+name);
		System.out.println("Balance = "+balance);
	}
	public double calBalance()
	{
		balance+=balance*int_rate/100;
		return balance;
	} 
}
