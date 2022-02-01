package practice;

import java.util.Scanner;

public class SumOfTwo {
	
	public static void verifySum(int arr[], int sum) {
		int count =0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					if(count>0) {
						System.out.print(" or ");
					}
					System.out.print("{"+arr[i]+", "+arr[j]+"} = "+sum);
					count++;
				}
			}
		}
		if(count==0) {
		System.out.println("no such number");
		}
	}
	
	public static void main(String ars[]) {
		int arr[]= {1,5,8,9,11,18,4,2,7};
		System.out.println("Please Enter The Sum");
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		verifySum(arr , sum);
		scan.close();
	}
}
