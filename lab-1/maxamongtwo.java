package advancedjava1;
import java.util.*;
public class maxamongtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Declare variables to store the two numbers
	        int num1, num2;

	        System.out.print("Enter two numbers: ");
	        num1 = scanner.nextInt();
	        num2 = scanner.nextInt();

	        
	        int max = (num1 > num2) ? num1 : num2;

	       
	        System.out.println("The maximum number is: " + max);

	     
	    }
	}

