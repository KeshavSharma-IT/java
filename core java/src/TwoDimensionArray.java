
public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,7,9},{1,3,5},{4,9,0},};
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr2[][]=new int[3][3];
		
		arr2[0][0]=1;
		arr2[0][1]=2;
		arr2[0][2]=3;
		
		arr2[1][0]=1;
		arr2[1][1]=2;
		arr2[1][2]=3;
		
		arr2[2][0]=1;
		arr2[2][1]=2;
		arr2[2][2]=3;
		
		
		System.out.println("1 row 1 column:"+arr2[0][0]);
		System.out.println("1 row 2 column:"+arr2[0][1]);
		System.out.println("1 row 3 column:"+arr2[0][2]);
		
		System.out.println("2 row 1 column:"+arr2[1][0]);
		System.out.println("2 row 2 column:"+arr2[1][1]);
		System.out.println("2 row 3 column:"+arr2[1][2]);
		
		System.out.println("3 row 1 column:"+arr2[2][0]);
		System.out.println("3 row 2 column:"+arr2[2][1]);
		System.out.println("3 row 3 column:"+arr2[2][2]);

	}

}
