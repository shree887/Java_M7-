import java.util.Scanner;
class Example3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = sc.nextInt();
		System.out.println((num%2==0)?num+" Number is Even":num + " Number is odd");
	}
}