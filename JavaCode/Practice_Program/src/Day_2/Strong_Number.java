package Day_2;

import java.util.Scanner;

public class Strong_Number {

	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number:");
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				int num =i;
				int temp=num;
				int sum=0;
				while(num!=0) {
					int mod=num%10;
					sum+=fact(mod);
					num=num/10;
				}
				if(sum==temp)
					System.out.println(i+" Number is Strong Number");
//				else
//					System.out.println("Number is Not Strong Number");
				
		}
			}
			

}
