// Import Random class for our random generator object
import java.util.Random;

class AccumulationDemo {
  public static void main(String[] args) {
    // Instantiate a new Random object
    Random randomGenerator = new Random();

    // Declare and initialize constants
    final int EXPECTED_ROLL_OUTCOME = 5;
    final int EXPECTED_SUM = 30;

    // Declare (and initialize some) variables
    int sum = 0;
    int dieRoll;

    // Start the loop (repeat "rolling a fair single-sided die")
    while (sum < EXPECTED_SUM){
      // "roll a die"
      dieRoll = randomGenerator.nextInt(6) + 1;
      System.out.println("Rolled: " + dieRoll);

      // If expected outcome, add it to the sum
      if (dieRoll == EXPECTED_ROLL_OUTCOME){
        System.out.println("We rolled " + dieRoll + " which is what we were looking for. Add to sum.");
        sum = sum + dieRoll;
      }
    }
  }
}
