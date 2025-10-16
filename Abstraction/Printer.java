package com.Abstract;

public class Printer {
	//Declare a private static variable to have single copy of it
private static Printer singlePrinter;
//constructor is private so preventing instantiation of the object from outside
private Printer() {
	System.out.println("Printer is ready");
}
//public static method to create instance
public static Printer getInstance() {
	if(singlePrinter==null) {
		singlePrinter =new Printer();
	}
	return singlePrinter;
}
void print(String Doc) {
	System.out.println("Printing :"+Doc);
}
}
