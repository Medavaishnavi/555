package polymorphisam;

class string1{
	
	public void launch(String name, int empid) {
		
		System.out.println("name: "+name);
		System.out.println("Roll no:"+empid);
	}
	public void launch(String name,int empid,String status) {
		
		System.out.println("name: "+name);
		System.out.println("Roll no:"+empid);
		System.out.println("Status of emp:"+status);
	}
public void launch(String name,int empid,String status, double chances) {
		
		System.out.println("name: "+name);
		System.out.println("Roll no:"+empid);
		System.out.println("Status of emp:"+status);
		System.out.println("chances of emp:"+chances);
		
	}
	
	
}


public class overloading2 {

	public static void main(String[] args) {
	string1 s1= new string1();
	s1.launch("Vaishnavi",22);
	s1.launch("prasad",25,"approved");
	s1.launch("bhargavi", 34, "done", 4.5);
	

	}

}
