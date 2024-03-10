package Day_1;

import java.util.Scanner;

public class PrintNumReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}

	}

}
