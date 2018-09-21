
import java.util.Random;
public class Arr2
{
	public static void main (String []args)
	{
		int [][]a=new int [3][3];
		int []rowsum=new int [3];
		int []colsum=new int [3];
		Random r=new Random();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=r.nextInt(99);	
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" a["+i+"]["+j+"]="+a[i][j]+"\t");	
			}
			System.out.println(" ");
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				rowsum[i]+=a[i][j];
				
			}
		System.out.println("rowsum["+i+"]= "+rowsum[i]);
		}
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				colsum[j]+=a[i][j];
				
			}
		System.out.println("colsum["+j+"]= "+colsum[j]);
		}
	}
}
		
