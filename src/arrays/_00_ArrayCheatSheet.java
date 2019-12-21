package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] things = {"hedgehog", "papaya","ribbon", "beaker", "hyperbola"};
		//2. print the third element in the array
		System.out.println(things[2]);
		//3. set the third element to a different value
		things[2] = "tulle";
		//4. print the third element again
		System.out.println(things[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<things.length;i++) {
		     System.out.println(things[i]);
		}
		
		//6. make an array of 50 integers
		int[] integers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		for (int n : integers) {
			Random number = new Random();
			int r = number.nextInt();
		     System.out.println(r);
		}
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
