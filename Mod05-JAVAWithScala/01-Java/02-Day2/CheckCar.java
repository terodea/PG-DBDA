public class CheckChar
{
	public static void main(String [] args)
	{


		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		     	vowelFlag=true;
		}
		if(vowelFlag == true)
		{
			System.out.println("char is vowel");
		}
		else
		{
			if (ch >= 65 && ch<= 90 || ch >= 97 && ch<= 122 )
			    System.out.println("char is consonant")
			else
			    System.out.println("char is not alphabet");
		}
}