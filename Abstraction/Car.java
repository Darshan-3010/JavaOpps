package com.Abstract;

interface Car {
	 void drive();
}
class Sedan implements Car{
	@Override
	public void drive() {
		System.out.println("Driving an Sedan car");
	}
}
class Suv implements Car{
	@Override
	public void drive() {
		System.out.println("Driving an Suv car");
	}
}
class Factory{
	public static Car getCar(String c) {
		if(c.equalsIgnoreCase("sedan")) {
			return new Sedan();
		}
		else if(c.equalsIgnoreCase("suv")) {
			return new Suv();
		}
		else {
			System.out.println("Such Cars is not Available");
			return null;
		}
	}
	}


