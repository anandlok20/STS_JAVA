package com.core;

public class Emp {
	private int id;
	private String name;
	private String email;
	private double basic;
	static int counter=100;
	public Emp(String name, String email, double basic) {
		this.id=counter++;
		this.name = name;
		this.email = email;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp id=" + id + ", name=" + name + ", email=" + email + ", basic=" + basic;
	}
	public double getBasic() {
		return basic;
	}
	public int getId() {
		return id;
	}
	public double salInc(double inc)
	{
		return basic+inc;
	}
	
}
