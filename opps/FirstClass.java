
class pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing somthing");
	}
}

public class FirstClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pen pen1=new pen();
		 pen1.color="pink";
		 pen1.type="ballpoint";
		 
		 pen pen2=new pen();
		 pen1.color="red";
		 pen1.type="gel";
		 
		 pen1.write();
		 
		 
	}

}
