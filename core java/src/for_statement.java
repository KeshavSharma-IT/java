
public class for_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		for (i=1;i<=10;i++) {
			System.out.println("that how  loop works: "+i);
		}
		
		int[] arr= {11,22,33,44,55,66,77,88};
		
		for(int j:arr) {
			System.out.println("this is loop in array: "+j);
		}
		
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println();
		System.out.println("this is 2d array:");
		
		for(int k=0;k<3;k++) {
			for(int l=0;l<3;l++) {
				System.out.print(arr2[k][l]+" ");
			}
			System.out.println();
		}
	}

}
