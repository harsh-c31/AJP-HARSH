package advancedjava1;
import java.util.*;
public class maxamongthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Declare three variables to store the input numbers
        int num1, num2, num3;

        // Take input from the user
        System.out.print("Enter three numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();


        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

       
        System.out.println("The maximum number is: " + max);

     
    }
}