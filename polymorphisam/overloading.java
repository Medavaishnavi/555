package polymorphisam;

class loading{
	
	public void add(int i, int j) {
	
		System.out.println(i+j);
		
	}
	public void add(int k, int l, int m) {
	
	System.out.println(k+l+m);
	}
	
}

public class overloading {

	public static void main(String[] args) {

		loading obj= new loading();
	obj.add(90,87);
	obj.add(95,96 , 99);
	
	}


}
