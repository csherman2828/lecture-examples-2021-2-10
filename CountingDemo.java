// Import Random class for our random generator object
import java.util.Random;

class CountingDemo {
    public static void main(String[] args) {
		// Instantiate a new Random object
		Random randomGenerator = new Random();
		
		// Declare and initialize constants
		final int EXPECTED_ROLL_OUTCOME = 5;
		final int EXPECTED_COUNT = 6;
		
		// Declare (and initialize some) variables
		int count = 0;
		int dieRoll;
		
		// Start the loop (repeat "rolling a fair single-sided die")
		while (count < EXPECTED_COUNT){
			// "roll a die"
			dieRoll = randomGenerator.nextInt(6) + 1;
			System.out.println("Rolled: " + dieRoll);
			
			// If expected outcome, count it
			if (dieRoll == EXPECTED_ROLL_OUTCOME){
				System.out.println("We rolled " + dieRoll + " which is what we were looking for. Count it!.");
				count = count + 1;
			}
		}
	
	}
	
}