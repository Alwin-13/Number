import java.util.Scanner;

public class Floatingnumber {
	public static void main()
	{
Scanner sc=new Scanner(System.in);
double number;
System.out.println("Enter any number");
 number=sc.nextDouble();
 if(number==0)
	 System.out.println("Number is Zero");
 else if(number>0)
	 System.out.println("Number is positive");
 else if(number<0)
	 System.out.println("Number is negative");
 else if(Math.abs(number)<1)
	 System.out.println("Number is small");
 else if(Math.abs(number)>1000000)
	 System.out.println("Number is large");
 else
	 System.out.println("Entered character is not a number");
	}

	}
