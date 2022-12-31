package io01;


public class Company {
	private int zip;
	private String compName;
	private String state;
	private double comRate;
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getComRate() {
		return comRate;
	}
	public void setComRate(double d) {
		this.comRate = d;
	}
	@Override
	public String toString() {
		return(compName+ "("+zip+state+") - $"+comRate);
	}
	

}