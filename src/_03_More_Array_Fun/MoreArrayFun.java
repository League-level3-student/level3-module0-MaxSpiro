package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printStringsBackwards(String[] strings) {
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printEveryOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i % 2 == 0) {
				System.out.println(strings[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printStringsRandomly(String[] strings) {
		Random r = new Random();
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[r.nextInt(strings.length)]);
		}
	}

}
