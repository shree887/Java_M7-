import java.util.*;
class Max
{
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = -7;
		int num3 = 7;

		System.out.println("Min among 3 num is : "+((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3))));
		
	}
}