package Day_1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}

	}

}
