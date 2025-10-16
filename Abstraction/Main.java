package com.Abstract;
class Talkies{
		 Movie movie;
		 Talkies(){
			movie =new Movie();	
		 }
		void start() {
		 movie.run();
		}
}
class Movie{
	 void run (){
		System.out.println("Movie is running");
	}
}
public class Main {
	public static void main(String[] args) {
	Talkies t=new Talkies();
	t.start();
	}
}

