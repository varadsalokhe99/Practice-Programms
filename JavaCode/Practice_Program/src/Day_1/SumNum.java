package Day_1;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
