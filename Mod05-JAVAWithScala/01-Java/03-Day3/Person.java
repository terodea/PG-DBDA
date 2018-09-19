class Person
{
	private String name;
	private Date bdate;
	private static int count;
	
	static{ count = 0; }
	public Person()
	{
		this.name=new String("");
		this.bdate=new Date();
		count++;
	}
	public Person(String name,int dd,int mm,int yy)
	{
		this.name=name;
		this.bdate=new Date(dd,mm,yy);
		count++;
	}
	public Person(Person p)
	{
		this.name=p.name;
		this.bdate=p.bdate;
		count++;
	}
	public void display()
	{
		System.out.println("Name = "+name);
		if(bdate != null)
		{
			System.out.println("Birthdate : ");
			bdate.showDate();
		}
	}
	public static void showCount()
	{
		System.out.println("Count no of person objects"+count);
	}
}
