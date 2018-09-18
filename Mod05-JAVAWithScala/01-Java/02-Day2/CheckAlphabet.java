public class CheckAlphabet
{
	public static void main(String []args)
	{
		char ch='A';
		if(ch=='a' || ch == 'e'||ch == 'i' ||ch == 'o'||ch == 'u'|| ch == 'A' || ch == 'E'|| ch == 'I' ||ch == 'O'|| ch == 'U' )
		{
			System.out.println("Given char is vowel");
		}
		else
		{
			if(ch >=65 && ch<=90 || ch >=97 && ch <=122)
				System.out.println("Given char is not a vowel but a consonant");
			else
				System.out.println("Char is not an alphabet");
		}
	}
}
