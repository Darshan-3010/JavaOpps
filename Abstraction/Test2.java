package com.Abstract;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Payment mode");
		String ip=scan.next();
		Payment p= factory.getPayment(ip);
		if(p!=null) {
			p.doPayment();
		}
	}

}
