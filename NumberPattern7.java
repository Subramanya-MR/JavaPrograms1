package numpattern;

import java.util.Scanner;

public class NumberPattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();
	
	
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
