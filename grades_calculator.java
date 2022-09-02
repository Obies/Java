package grades;

public class grades_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D Array is used for storing test marks
		int[] myTestResults = {69, 75, 85, 88, 93};
		int Total = 0;
		
		//for loop is used to iterate through the array number positions
		for (int i = 0; i < myTestResults.length; i++){
			Total = Total + myTestResults[i];
		
		}
		//Average formula is declared and initialised
		int average = Total / myTestResults.length;
		System.out.println("Average: " + average);
		
		//Statement printed out using if statement when average meets criteria
		if (average > 80){
			System.out.println("Congratulations you got an A");
		}
		if (average > 70 && average < 79){
			System.out.println("Almost there you got a B");
		}
		if (average > 60 && average < 69){
			System.out.println("Just a little harder you got a C");
		}
		if (average >50 && average < 59){
			System.out.println("You passed, you got a D");
		}
		if (average < 49){
			System.out.println("Try a little harder, you got an F");
		}
	}		
}

