package com.collabera.uniquewords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter words to count and sort");
		String test = input.nextLine();

		// String test = "Hello HELLO worlD WORld hi go go power rangers zebra zebra";
		String[] words = test.split("\\s+");
		ArrayList<String> hello = new ArrayList<String>();

		// add words to Array List
		for (int i = 0; i < words.length; i++) {
			hello.add(words[i].toLowerCase());
		}
		// Prints all values inside ArrayList
		hello.sort(null);
		hello.add(null);
		for (int i = 0; i < words.length; i++) {
			if (!hello.get(i).equals(hello.get(i + 1))) {
				System.out.println(hello.get(i) + " - " + Collections.frequency(hello, hello.get(i)));
			} else {

			}

		}
		input.close();

	}
}
