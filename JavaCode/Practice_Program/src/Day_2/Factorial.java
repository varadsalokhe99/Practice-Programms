package Day_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			int fact =1;

		for(int i=1;i<=j;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	}

}
