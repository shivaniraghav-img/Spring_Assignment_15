package com.example.Spring_jdbc2.Entity;

public class Product {
	private int Pid;
    private String Pname;
    private float Pprice;
    private int  Pquantity;
    public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public float getPprice() {
		return Pprice;
	}
	public void setPprice(float pprice) {
		Pprice = pprice;
	}
	public int getPquantity() {
		return Pquantity;
	}
	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}
	
}
