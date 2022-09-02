//Java program to calculate positive, negative and average of both number types
import java.util.Scanner;

public class average_number_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{	
		 //variable type declaration
		   int pos = 0;
		   int neg = 0;
		   int sum = 0;
		   double average = 0.0;
		      
		      
		 //Scanner to receive input
		   Scanner in = new Scanner(System.in);
		   System.out.println("Please enter an integer, to close the program type 0: ");
		   int enter = in.nextInt();
		/* while(enter !=0){
			 if (enter > 0) {
				 pos = pos + 1;
			 }
		 }
		  */
		   
		   
		   
		 //while loop used to repeat request till 0 entered
		 //if statement counts positive numbers  
		 while( enter != 0 ) {   
		   if (enter > 0) {
			   pos = pos + 1;
		   }
		   
		 //else statement counts negative numbers
		    else {
		    	neg = neg + 1;
		   }
		            
		 //Calculates the sum
		   sum = enter + sum;
		         
		   System.out.println("Enter another number: ");
		   enter = in.nextInt();
		         
		 //Calculate average
		   average = (double) sum /(pos + neg); 
		       
		 }
		 if (average !=0) {
		        		
			 System.out.println("You have " + pos + " positive numbers");
			 System.out.println("You have " + neg + " negative numbers");
			 System.out.println("Your total is: " + (double)sum);
			 System.out.println("You have an average of " + average);
		 }
		      		             
		}
	}
}