package com.regex;

public class RemoveExtraSpaces {
	public static void main(String[] args) {

		String str = "This   is   an    example   with   multiple   spaces.";
		str = str.replaceAll("\\s+", " ");

		System.out.println(str);
	}
}
