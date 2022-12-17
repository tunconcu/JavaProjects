package JavaProjects;
import java.util.Scanner;
public class FindNumber {
    public static void main(String[] args) {
        System.out.println("Program to search for a specific number in an array");
        int[] nums = {1,2,3,4,5,6,7,8,9};
		int target = 5;
		boolean numExist = false;
		
		for(int num : nums) {
			if(num == target) {
				numExist = true;
				break;
			}else {
				numExist = false;
			}
		}
		System.out.println("Does number exist? " + numExist );
        
    }
    
}
