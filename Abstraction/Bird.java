package com.Abstract;

public abstract class Bird {
	abstract void fly();
	abstract void eat();
}
class Sparrow extends Bird{
	void fly() {
		System.out.println("Sparrow fly at fast");
	}
	void eat() {
		System.out.println("Sparrow eat grains");
	}
}
  abstract class Eagle extends Bird{
	abstract void fly();
	void eat() {
		System.out.println("Eagle eat snakes");
	}
  }
 class SerpentEagle extends Eagle{
	void eat() {
		System.out.println("SerpentEagle eat snakes");
	}
	void fly() {
		System.out.println("SerpentEagle fly at fast");
	}
}
class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("GoldenEagle eat fish");
}
	void fly() {
		System.out.println("GoldenEagle fly at fast");
	}
}
class Crow extends Bird{
	void fly() {
		System.out.println("Crow fly at Medium");
	}
	void eat() {
		System.out.println("Crow eat insects");
	}
}
