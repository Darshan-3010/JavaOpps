package com.Abstract;

interface Payment {
	void doPayment();
}
class UPI implements Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment successfull using UPI");
	}
}
class CreditCard implements Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment successfull using Credit Card");
	}
}
class DebitCard implements Payment{
	@Override
	public void doPayment() {
		System.out.println("Payment successfull using Debit Card");
	}
}
class factory{
	public static Payment getPayment(String p) {
		if(p.equalsIgnoreCase("upi")) {
			return new UPI();
		}
		else if(p.equalsIgnoreCase("credit")) {
			return new CreditCard();
		}
		else if(p.equalsIgnoreCase("debit")) {
			return new DebitCard();
		}
		else {
			System.out.println("Such option is not available");
			return null;
		}
	}
}
