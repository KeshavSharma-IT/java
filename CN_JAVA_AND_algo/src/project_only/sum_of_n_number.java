package project_only;

import java.util.Scanner;

public class sum_of_n_number {
	
	public static void main(String[] args) {
		
		int n,i=1,sum=0;
		System.out.println("sum of n no?");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(i<=n) {
			sum=sum+i;
			
			i++;
			
		}
		System.out.println(sum);
		
		
		
	}

	
	}

