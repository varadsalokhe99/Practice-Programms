package Day_1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n =sc.nextInt();
		
		for(int i=1;i<n;i++) {
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					{
					flag=false;
					break;
					}
			}
			if(flag)
				System.out.print(i+" ");
		}
		

	}

}
