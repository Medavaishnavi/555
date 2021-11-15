package polymorphisam;

class A{
 public void stint() {
System.out.println("lala");	
}
	
}	
 

class B extends A{
	
	@override
	 public void stint() {
		//super.stint();
		 System.out.println("lulu");
	 }
	 
 }

public class overridding {
 public static void main(String[] args) {
	
	B b1= new B();
b1.stint();



 }


}
