package noDuplicates;
import java.util.Arrays;

public class no_duplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to remove duplicates from an array
		//Variables are declared and initialised
		//Array is printed before method is used
		int[] Array = {20,100,10,80,70,1,0,-1,2,10,15,300,7,6,2,18,19,21,9,0};
		for(int i = 0; i < Array.length; i++){	
			System.out.println("Before removing duplicates: " + Array[i] + " ");
		}
		//Arrays.sort is used to sort the array numbers from smallest to largest for 
		//easy duplicate identification
		int removeDup = Array.length;
		Arrays.sort(Array);
		
		//Array is printed in order
		for (int j = 0; j < Array.length; j++){
			System.out.println("\nSorted Array: " + Array[j]);
		}
		//Method is used here to perform operation of removing duplicates in Array
		removeDup = noDuplicates(Array, removeDup);
		
		//For loop is used to print out Array without duplicates
		for (int z = 0; z < removeDup; z++){
			System.out.println("Array without duplicates is: " + Array[z] + " ");
		}
	}
	//Method created to remove the duplicates 
	public static int noDuplicates(int[] array, int length_array){
		//Logical operator is used to compare the Arrays when the new one is created
		if (length_array == 0 || length_array == 1){
			return length_array;
		}
		//For loop is used to store the values in the separate Array without duplicates
		//while the if statement checks that the numbers stored in the separate Array are not identical to the original Array
		int removed = 0;
		for(int i = 0; i < length_array - 1; i++){
			if (array[i] != array[i+1]){
				array[removed++] = array[i];
			}
		}
		//Returns the new stored Array values 
		array[removed++] = array[length_array - 1];
		return removed;
	}
}
