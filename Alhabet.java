import java.util.Scanner;
class Alhabet
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a charcter : ");
		char ch = sc.next().charAt(0);
		// 
		System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z')?"UpperCase Alpha":"LowerCase Alpha")):"Not an Alphabet");
	}
}