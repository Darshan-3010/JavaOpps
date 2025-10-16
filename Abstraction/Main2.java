package com.Abstract;

public class Main2 {public static void main(String[] args) {
	Primeminister p1= Primeminister.getInstance();
	Primeminister p2= Primeminister.getInstance();
	p1.print("talking");
	p2.print("talking");
	System.out.println(p1==p2);
}
}
