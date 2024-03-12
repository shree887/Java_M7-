import java.util.Scanner;  // importing the Scanner class
class ScannerExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // Creating an obj of Scanner class
		System.out.print("Enter your name : "); 
		String name = sc.next().toLowerCase(); // util the methods of Scanner ref variable - sc
		char ch = name.charAt(0); // extracting the charcter which is at 0th index
		System.out.println("Hi my name is "+name+" and my first charcter is "+ ch);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Charcter "+ ch + " is a vowel.");
		}else{
			System.out.println("Charcter "+ ch + "is a consonent");
		}
		
	}
}