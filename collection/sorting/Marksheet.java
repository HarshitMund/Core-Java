package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private int rollNo;
	private String name;
	private int phy;
	private int chm;
	private int maths;
	
	public Marksheet(int rollNo, String name, int phy, int chm, int maths) {
		this.rollNo =  rollNo;
		this.name = name;
		this.phy = phy;
		this.chm = chm;
		this.maths = maths;
	}
	
	@Override
	public String toString() {
		return "Roll No: " + rollNo + ", Name: " + name + ", Phy: " + phy + ", Chm: " + chm + ", Maths: " + maths;
	}

	@Override
	public int compareTo(Marksheet o) {
		return this.rollNo - o.rollNo;
	}
	
}
