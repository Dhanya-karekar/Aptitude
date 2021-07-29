package com.xworkz.aptitude.assign;

public class FindingCountsOfSpecificCharacter {

	public static void main(String[] args) {

		String s = "djfhsdlfjdhv";
		int character = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'h')
				character++;
		}
		System.out.println(character);

	}
}
