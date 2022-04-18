
public class IF_else_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testscore=56;
		char grade;
		if (testscore>=90) {
			grade='A';
			System.out.println("your grade is: "+grade);
		}
		else if(testscore>=80){
			grade='B';
			System.out.println("your grade is: "+grade);
		}
		
		else if(testscore>=60){
			grade='C';
			System.out.println("your grade is: "+grade);
		}
		else if(testscore>=40){
			grade='D';
			System.out.println("your grade is: "+grade);
		}
		else if(testscore>=33){
			grade='E';
			System.out.println("your grade is: "+grade);
		}
		else {
			grade='F';
			System.out.println("your grade is: "+grade);
		}

	}

}
