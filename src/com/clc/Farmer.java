package com.clc;

public class Farmer {
	private String fName;
	private String aAge;
	private String aType;
	
	public void printAnimal() {
		System.out.println("Hi " + fName + " your " + aType + " is " + aAge + " years." );
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getaAge() {
		return aAge;
	}

	public void setaAge(String aAge) {
		this.aAge = aAge;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}
	

}
