package Day_1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		int temp =n;
		int sum=0;
		while(n!=0) {
			int mod=n%10;
			sum=sum*10+(mod);
			n=n/10;
		}
		if(sum==temp) 
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");

	}

}
