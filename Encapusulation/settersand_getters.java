package Encapusulation;


class office{
	int empid;
	 String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}
public class settersand_getters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	office E1= new office();
	E1.setEmpid(55);
	E1.setEmpname("vaishu");
	System.out.println(E1.getEmpname());
	System.out.println(E1.getEmpid());
	
	
	E1.setEmpid(54);
	E1.setEmpname("yashi");
	System.out.println(E1.getEmpid());
	System.out.println(E1.getEmpname());
	
	
	
	
	}

}
