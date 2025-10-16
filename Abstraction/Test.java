package com.Abstract;

public class Test {
	public static void main(String[] args) {
		Sparrow s=new Sparrow();
		s.fly();
		s.eat();
		SerpentEagle s1=new SerpentEagle();
		s1.eat();
		s1.fly();
		GoldenEagle ge=new GoldenEagle();
		ge.eat();
		ge.fly();
		Crow c=new Crow();
		c.fly();
		c.eat();
		}
}
