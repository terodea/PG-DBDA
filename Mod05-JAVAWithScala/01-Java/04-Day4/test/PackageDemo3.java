//Package by import statement
import office.staff.Trainer;
import office.staff.Admin;
import office.student.Student;
public class PackageDemo2
{
	public static void main(String []args)
	{
		Trainer t=new Trainer();
		t.display();
		
		Admin a=new Admin();
		a.display();
		

		Student s=new Student();
		s.display();
	}
}
