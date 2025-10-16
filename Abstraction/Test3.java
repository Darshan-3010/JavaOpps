package com.Abstract;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Car Type");
		String ip=scan.next();
		Car car=Factory.getCar(ip);
		if(car!=null){
			car.drive();
		}
	}
}
