package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random randy =  new Random();
		//1. make an array of 5 Strings
String[] strings = new String[] {"1","2","3","4","5"};
		//2. print the third element in the array
System.out.println(strings[2]);
		//3. set the third element to a different value
strings[2]="me";
		//4. print the third element again
System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
for(int i=0;i<strings.length;i++) {
	strings[i]="joe";
}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
for(int i=0;i<strings.length;i++) {
	System.out.println(strings[i]);
}
		//7. make an array of 50 integers
int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for(int i=0;i<integers.length;i++) {
	integers[i]=randy.nextInt(500);
}
		//9. without printing the entire array, print only the smallest number on the array
int smallestNumber=integers[0];
for(int i=0;i<integers.length;i++) {
	if(integers[i]<smallestNumber) {
		smallestNumber=integers[i];
	}
}
System.out.println("Smallest number is: "+smallestNumber);
		//10 print the entire array to see if step 8 was correct
for(int i=0;i<integers.length;i++) {
	System.out.println(integers[i]);
}
		//11. print the largest number in the array.
int largestNumber=integers[0];
for(int i=0;i<integers.length;i++) {
	if(integers[i]>largestNumber) {
		largestNumber=integers[i];
	}
}
System.out.println("Largest number is: "+largestNumber);
		//12. print only the last element in the array
System.out.println("The last number is: "+integers[49]);
	}
}
