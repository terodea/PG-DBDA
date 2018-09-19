public class SavAccountDemo
{
	public static void main(String []args)
	{
		int accno=Integer.parseInt(args[0]);
		double balance=Double.parseDouble(args[2]);
		SavAccount a1=new SavAccount(accno,args[1],balance);
		a1.display();
		System.out.println("Balance with interest= "+a1.calBalance());
	}
}
