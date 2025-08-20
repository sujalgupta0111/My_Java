package Serealization.savingdiiferentobjectinfiles;

import java.io.Serializable;

class dog implements Serializable{
	private String name;
	private int legs;

	dog(String name, int legs) {
		
		this.name = name;
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "dog [name=" + name + ", legs=" + legs + "]";
	}
	

}

class cat implements Serializable{
	private String name;
	private int legs;
	cat(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	@Override
	public String toString() {
		return "cat [name=" + name + ", legs=" + legs + "]";
	}

}
