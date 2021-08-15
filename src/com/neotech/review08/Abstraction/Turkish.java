package com.neotech.review08.Abstraction;

public class Turkish extends Human {

	public Turkish(String name) {
		super(name);
		
	}

	@Override
	public void talk() {
		System.out.println(name + " says Merhaba.");
		
	}
	
	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare");
	}

}
