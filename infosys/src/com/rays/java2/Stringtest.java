package com.rays.java2;

public class Stringtest {

	public static void main(String[] args) {
//problem 1
		String name = "lucky rajpoot"; 
		name = name.toLowerCase();
		System.out.println(name);
// problem 2
		String text = "this is my friend";
		text =text.replace(  " ", "__");
		System.out.println( text);
//		problem 3
		String letter = "Dear <|name|>,thanks a lot";
		letter =letter.replace("<|name|>", "lucky");
		System.out.println( letter);
//		problem 4
		String mystring = "this is  my   pen";
		System.out.println(mystring.indexOf("  "));
		System.out.println(mystring.indexOf ("   "));
//		problem 5 
		String myletter = "Dear lucky\n this java course is niece\n. thankyou";
		System.out.println(myletter);
	}

}
