public class DateDemo
{
	public static void main(String []args)
	{
		Date d1=new Date();
		d1.showDate();

		Date d2=new Date(11,11,1999);
		d2.showDate();

		Date d3=new Date(d2);
		d3.showDate();
		
		d3.showDate('-');
		
		if(d1.equals(d2))
			System.out.println("d1 and d2 are equal");
		else
			System.out.println("d1 and d2 are not equal");
		
		if(d2.equals(d3))
			System.out.println("d2 and d3 are equal");
		else
			System.out.println("d2 and d3 are not equal");
	}
}
