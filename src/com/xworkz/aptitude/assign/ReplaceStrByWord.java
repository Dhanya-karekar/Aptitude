package com.xworkz.aptitude.assign;

public class ReplaceStrByWord {

	public static void main(String[] args) {
		String s = "i love ice-cream";
		System.out.println("before replacing: " + s);

		String replaceString = s.replaceAll("ice-cream", "chocolates");
		System.out.println("After replacing: " + replaceString);
	}

}
