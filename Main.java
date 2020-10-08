import java.util.Scanner;
/**
 *
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //
		Scanner input = new Scanner(System.in);
		// create an array with 5 spots
		final int NUM_MARKS = 5;
		double[] grades = new double[NUM_MARKS];
		for (int i = 0; i < NUM_MARKS; i++){
			System.out.println("Please enter in grade " + (i+1));
			grades[i] = input.nextInt();
		}
		//create an accumulator
		double sum=0;
		//use a for loop to go through the array to add the sum
		for(int i = 0; i < grades.length;i++){
			//add the grade to sum
			sum = sum + grades[i];
		}
		double average = sum/NUM_MARKS;
		System.out.println("Your average grade is " + average);
  }
}