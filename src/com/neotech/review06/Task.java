package com.neotech.review06;

public class Task {
	
	public String name;
	public int age;
	public double weight;
	
	public Task(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+ name + " age: " + age + " weight: " + weight);
	}
}
