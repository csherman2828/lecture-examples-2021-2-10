import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    char choice;

    // CODE HERE: read in integers from the user

    do {
      printMenu();
      choice = userInput.nextLine().charAt(0);

      switch(choice) {
        case 'A':
          // print(array);
          break;
        case 'B':
          // array = reverse(array);
          break;
        case 'C':
          // array = duplicate(array);
          break;
        case 'X':
          System.out.println("Exitting...");
          break;
        default:
          System.out.println("Please choose a valid option...");
      }
    } while(choice != 'X');

    return;
  }

  private static void printMenu() {
    System.out.println("Choose an option:");
    System.out.println("\t A. Print");
    System.out.println("\t B. Reverse");
    System.out.println("\t C. Duplicate");
    System.out.println("\t X. Exit");
    System.out.print("> ");
  }

  // method that takes an array of ints and prints its contents line by line
  private static void print(int[] numbers) {
    // CODE HERE: finish the method
    return;

  }

  // method that takes an array of ints and returns an array of ints that is
  //  the same as the original but with a reversed order
  private static int[] reverse(int[] numbers) {
    // CODE HERE: finish the method
    return numbers;
  }

  // method that takes an array of ints and returns an array of ints that is
  //  the original array repeated twice
  private static int[] duplicate(int[] numbers) {
    // CODE HERE: finish the method
    return numbers;
  }
}
