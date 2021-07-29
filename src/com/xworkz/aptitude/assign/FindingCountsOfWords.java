package com.xworkz.aptitude.assign;

public class FindingCountsOfWords {

	public static void main(String[] args) {
		String str = "im sleepy";
		int words = 1;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch)) {
				words++;
			}
		}
		System.out.println(words);

	}

}
