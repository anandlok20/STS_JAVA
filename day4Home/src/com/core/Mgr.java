package com.core;

public class Mgr extends Emp {
	private double perfBonus;

	public Mgr(String name, String email, double basic, double perfBonus) {
		super(name, email, basic);
		this.perfBonus = perfBonus;
	}

	public double netSalary()
	{
		return super.getBasic()+perfBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " perfBonus=" + perfBonus+ " NetSalary="+netSalary();
	}
}
