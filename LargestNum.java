package BasicCorePrograms;
import java.util.Scanner;

public class LargestNum {

		public static void main(String[] args) {
			int a,b,c;
			   Scanner num = new Scanner(System.in);
			   System.out.println("Enter first number");
			   a=num.nextInt();
			   System.out.println("Enter second number");
			   b=num.nextInt();
			   System.out.println("Enter third number");
			   c=num.nextInt();
			   if (a>b && a>c) 
			   System.out.println(a+ " is the largest Number" );
			   else if (b>a && b>c)
			   System.out.println(b+ " is the largest Number");
			   else
			   System.out.println (c+ " is the largest Number");   
			   
		}

	}