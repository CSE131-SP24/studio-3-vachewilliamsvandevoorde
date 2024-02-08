package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your value for n?");
		int n = in.nextInt();
		
		boolean[]narray = new boolean [n];
		for (int k = 0; k < n; k++)
		{
			narray [k] = true;
		}
		for (int i = 2; i < n; i++)
		{
			//count up by 2s
			for (int j = 2*i; j < n; j = j+i)
			{
			 narray [j-1]= false;
			}			
		
		}
		for (int k = 0; k < n; k++)
		{
			if (narray [k])
					{
				System.out.println(k+1);
					}
		}
	}

}
