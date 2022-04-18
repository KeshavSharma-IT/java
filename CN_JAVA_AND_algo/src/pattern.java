import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("how many row you want");
	int n=sc.nextInt();
	int i=1;
			
//	bsisc
//	while(i<=n) {
//		int j=1;
//		while(j<=n) {
//			System.out.print('*');
//			j+=1;
//		}
//		System.out.println();
//		i+=1;
//	}
	
//	square 1
//	while (i<=n) {
//		int j=1;
//		while(j<=n) {
//			System.out.print(i);
//			j++;
//		}
//		System.out.println();
//		i+=1;
//	}
//	
	
//	square 2
//	 while(i<=n) {
//		int j=1;
//		while(j<=n) {
//			System.out.print(j);
//			j++;
//			
//		}
//		System.out.println();
//		i++;
//	 }
//	
	 
//	 square 3
//	 while(i<=n) {
//			int j=1;
//			while(j<=n) {
//				System.out.print(n-j+1);
//				j++;
//				
//			}
//			System.out.println();
//			i++;
//		 }

	
	
//	 triangle 1
//	int p=1;
//	while(i<=n) {
//		int j=1;
//		while(j<=i) {
//			System.out.print(p);
//			j++;
//			p++;
//		}
//		System.out.println();
//		i++;	
//	}
	
// triangle 2
	
//	while(i<=n) {
//		int j=1;
//		int p=i;
//		while(j<=i) {
//			System.out.print(p);
//			j++;
//			p++;
//		}
//		System.out.println();
//		i++;
//		}
	
//	Character pattern 1
	 
//	while(i<=n) {
//		int j=1;
//		while(j<=n) {
//			char ch=(char)('A'+j-1);
//			System.out.print(ch);
//			j++;
//		}
//		System.out.println();
//		i++;
//	}
	
	
//	character pattern 2
	
//	while(i<=n) {
//		int j=1;
//		int k=i;
//		while(j<=n) {
//			char ch=(char)('A'+k-1);
//			System.out.print(ch);
//			j++;
//			k++;
//		}
//		System.out.println();
//		i++;
//	}
	
	
//	mirror pattern
	
	while(i<=n) {
	
		
			
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
				
			}
			int star=1;
			while(star<=i) {
				System.out.print("*");
				star++;
				
			}
		System.out.println();
		i++;
	
	
	}

}
}
	