package Day_1;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n =sc.nextInt();
		boolean flag =true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0)
				flag = false;
		}
		if(flag)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
