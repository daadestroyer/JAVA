package com.rvce.model;

public class ProductModel {

	
	private String pid;

	private String pname;
	private String pprice;
	private String pdesc;

	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductModel(String pid, String pname, String pprice, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pdesc = pdesc;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

}
