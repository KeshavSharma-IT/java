
public class for_loop_ {

	public static void main(String[] args) {
		int  n=5; 
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}

		for (int i=1,j=100;i<=n && j<=200;i++,j+=20) {
			System.out.println(i+" "+j);
			
		}
		
		for(int i=1;i<=n;i++) {
//			System.out.println(i);
			for(int j=1;j<=n;j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
