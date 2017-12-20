package com.abdulqadirsprojects.springCourse;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;

	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate() {
		// this would refer to a String representation of the class (i.e. will call toString method
		System.out.println("Person created: " + this);
	}

	public void onDestroy() {
		System.out.println("Person destroyed");
	}

	public void speak() {
		System.out.println("Hello I'm a person");
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	// Address object can now be injected into this Person object
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}





	
	
}
