package com.core;

public class Worker extends Emp {
	private int hourWorked;
	private double hourlyRate;
	public Worker(String name, String email, double basic, int hourWorked, double hourlyRate) {
		super(name, email, basic);
		this.hourWorked = hourWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return super.toString()+" hourWorked=" + hourWorked + ", hourlyRate=" + hourlyRate+" Net Salary="+netSalary();
	}
	public double netSalary()
	{
		return super.getBasic()+(hourlyRate*hourWorked);
	}
}
