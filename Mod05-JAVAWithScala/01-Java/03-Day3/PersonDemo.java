public class PersonDemo
{
	public static void main(String []args)
	{
		Person p1=new Person();
		p1.display();
		Person.showCount();
		
		Person p2=new Person("Anna",9,11,1999);
		p2.display();
		Person.showCount();
		
		Person p3=new Person(p2);
		p3.display();
		Person.showCount();
	}
}
