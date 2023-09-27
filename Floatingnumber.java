import java.util.Scanner;

public class Floatingnumber {
	public static void main()
	{
Scanner sc=new Scanner(System.in);
float number;
System.out.println("Enter any number");
 number=sc.nextFloat();
 if(number==0)
	 System.out.println("Number is Zero");
 else if(number>0)
	 System.out.println("Number is positive");
 else if(number<0)
	 System.out.println("Number is negative");
 else if(number<1)
	 System.out.println("Number is small");
 else if(number>1000000)
	 System.out.println("Number is large");
 else
	 System.out.println("Entered character is not a number");
	}

	}
