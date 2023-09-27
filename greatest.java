import java.util.Scanner;

public class greatest {
	public static void main(String [] args)
	{
Scanner sc = new Scanner(System.in);
int number1,number2,number3;
System.out.println("Enter any 3 numbers");
number1=sc.nextInt();
number2=sc.nextInt();
number3=sc.nextInt();
if(number1>number2&&number1>number3)
System.out.println("Number1 is greatest");
else if(number2>number3)
	System.out.println("Number2 is greatest");
else
	System.out.println("Number3 is greatest");
}
	}
