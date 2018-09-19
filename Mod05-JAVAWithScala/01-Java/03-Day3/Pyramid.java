public class Pyramid
{
	public static void main(String []args)
	{
    		for(int i=0;i<5;i++)
   		 {
        		for(int j=0;j<5-i-1;j++)
        		{
            			System.out.print(" ");
        		}
        		for(int k=5-i;k<=5;k++)
        		{
            			System.out.print(i);
        		}
        		for(int k=5-i;k<5;k++)
        		{
            			System.out.print(i);
        		}
        		for(int j=0;j<5-i;j++)
        		{
            			System.out.print(" ");
        		}

        	System.out.print("\n");
    		}
	}

}


