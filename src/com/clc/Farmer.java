package com.clc;

public class Farmer {
	private String fName;
	private String aAge;
//	private String aType;
	//Get Animal name from Class Animal
	private Animal animal;
	
	public void printAnimal() {
		System.out.println("Hi " + fName + " your " + animal.getaName() + " is " + aAge + " years." );
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

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	/*
	 * public String getaType() { return aType; }
	 * 
	 * public void setaType(String aType) { this.aType = aType; }
	 */
	

}
