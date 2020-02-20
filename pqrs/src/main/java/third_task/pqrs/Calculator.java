package third_task.pqrs;
import java.util.Scanner;
public class Calculator {
	  public static void main(String args[])
	   {
	      int num1, num2, res;
	      char ch;
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.print("First Number : ");
	      num1 = sc.nextInt();
	      System.out.print("Second Number : ");
	      num2= sc.nextInt();
	      System.out.print("Enter Operator (+, -, *, /) : ");
	      ch = sc.next().charAt(0);
	 
	      if(ch == '+')
	      {
	           res = num1 + num2;
	           System.out.print("Result = " +res);
	      }
	      else if(ch == '-')
	      {
	           res = num1 - num2;
	           System.out.print("Result = " +res);
	      }
	      else if(ch == '*')
	      {
	           res = num1 * num2;
	           System.out.print("Result = " +res);
	      }
	      else if(ch == '/')
	      {
	           res = num1 / num2;
	           System.out.print("Result = " +res);
	      }
	      else
	      {
	           System.out.print("Wrong Operator !!!");
	      }
	           
	   }

}
