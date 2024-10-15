package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = new int[5];
	int possum = 0, negsum = 0, sum = 0;
	int poscount = 0, negcount = 0;
	int posavg, negavg, avg;
	System.out.printf("Enter five integers: ");
	for(int i = 0; i < 5; i++) {
		nums[i] = input.nextInt();
	}
	
	for(int num : nums) {
		if(num > 0) {
			possum += num;
			poscount++;
		} else if (num < 0) {
			negsum += num;
			negcount++;
		}
		sum += num;
	}
	
	avg= sum/5;
	posavg=possum/5;
	negavg=negsum/5;
	System.out.printf("The positive sum is %d", possum);
	System.out.printf("The negative sum is %d", negsum);
	System.out.printf("The sum is %d", sum);
	System.out.printf("The average of all numbers is %d\n", avg);
    System.out.printf("The average of positive numbers is %.2f\n", posavg);
    System.out.printf("The average of negative numbers is %.2f\n", negavg);

    input.close(); 
	}
}
