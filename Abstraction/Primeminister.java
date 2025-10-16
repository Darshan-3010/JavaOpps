package com.Abstract;

public class Primeminister {
	private static Primeminister singlepm;
	private Primeminister() {
		System.out.println("Primeminister is ready to take action");
	}
	public static Primeminister getInstance() {
		if(singlepm==null) {
			singlepm =new Primeminister();
		}
		return singlepm;
	}
	void print(String Action) {
		System.out.println("Taking Action :"+Action);
	}

}
