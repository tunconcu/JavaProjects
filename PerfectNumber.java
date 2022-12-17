package JavaProjects;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        System.out.println("Program to find if a number is perfect number or not");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int num1 = scanner.nextInt();
		int sum1 = 0;
		
		for(int i=1;i<num1;i++) {
			if(num1 % i == 0) {
				sum1 += i;
			}
		}
		if(sum1 == num1) {
			System.out.println("This is a perfect number: " + num1);
		}else {
			System.out.println("This is not a perfect number: " + num1);
		}
		
    }
}
