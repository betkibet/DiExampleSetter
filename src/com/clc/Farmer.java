package com.clc;

import java.util.Map;

public class Farmer {
	private String fName;
	private String aAge;
	//Get Animal name from Class Animal
//	private Animal animal;
	private Animal[] animal;
//	private FarmTools farmTools;
	private FarmTools[] farmTools;
	
	
	public void printAnimal() {
//		System.out.println("Hi " + fName + " your " + animal.getaName() + " is " + aAge + " years. You use " + farmTools.getfTool() + " for " + farmTools.getuTool() );
		for (Animal animal2 : animal) {
			System.out.println(animal2.getaName());
		}
		
		for (FarmTools f : farmTools) {
			System.out.println(f.gettTool());
		}
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

	

	public Animal[] getAnimal() {
		return animal;
	}

	public void setAnimal(Animal[] animal) {
		this.animal = animal;
	}

	public FarmTools[] getFarmTools() {
		return farmTools;
	}

	public void setFarmTools(FarmTools[] farmTools) {
		this.farmTools = farmTools;
	}
	
	/*
	 * public FarmTools getFarmTools() { return farmTools; }
	 * 
	 * public void setFarmTools(FarmTools farmTools) { this.farmTools = farmTools; }
	 */

	/*
	 * public String getaType() { return aType; }
	 * 
	 * public void setaType(String aType) { this.aType = aType; }
	 */
	

}
