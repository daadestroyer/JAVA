package prog1_generics;

public class Employee {

	private int eid;
	private String ename;
	private String ecity;
	private String esal;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEcity() {
		return ecity;
	}

	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public Employee(int eid, String ename, String ecity, String esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", esal=" + esal + "]";
	}
	
	
	
}
