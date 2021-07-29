package com.xworkz.aptitude.assign;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = "welcome to shimoga";

		char c1 = 's';
		char c2 = '*';
		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if (ch[i] == c1) {
				ch[i] = c2;
			}
			System.out.println(ch[i]);
		}

	}

}
