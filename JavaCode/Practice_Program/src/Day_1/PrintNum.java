/*Print 1 to n num*/

package Day_1;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
