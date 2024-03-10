package Day_1;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		int sum =0;
		for(int i=2;i<10;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				
				if(i%j==0)
					{
					flag=false;
					break;
					}
			}
			if(flag)
				sum+=i;
		}
		System.out.println(sum);

	}

}
