package prog2_LinkedList_ArrayList;

public class EmployeeArrayList {

	private int eid;
	private String ename;
	private String esal;
	private String scity;
	public EmployeeArrayList(int eid, String ename, String esal, String scity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.scity = scity;
	}
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
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "EmployeeArrayList [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", scity=" + scity + "]";
	}
	
	
}
