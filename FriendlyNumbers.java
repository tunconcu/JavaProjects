package JavaProjects;
import java.util.Scanner;
public class FriendlyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to check if 2 numbers are friendly numbers");
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=1;i<num1;i++) {
			if(num1 % i == 0) {
				sum1 += i;
			}
		}
		
		for(int i=1;i<num2;i++) {
			if(num2 % i == 0) {
				sum2 += i;
			}
		}
	   
		System.out.println("First number sum = " + sum1);
		System.out.println("Second number sum = " + sum2);
	    
	    if(sum1 == num2 && sum2 == num1) {
	    	System.out.println("These numbers are friendly numbers.");
	    }else {
	    	System.out.println("These numbers are not friendly numbers.");
	    }
    }
}
