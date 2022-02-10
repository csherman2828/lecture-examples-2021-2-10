import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int count;
    char choice;
    int[] array;

    System.out.print("How many numbers will you enter: ");
    count = userInput.nextInt();
    userInput.nextLine();        // clear buffer

    array = new int[count];
    for(int i = 0; i < count; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      array[i] = userInput.nextInt();
      userInput.nextLine();        // clear buffer
    }

    do {
      printMenu();
      choice = userInput.nextLine().charAt(0);

      switch(choice) {
        case 'A':
          print(array);
          break;
        case 'B':
          array = reverse(array);
          break;
        case 'C':
          array = duplicate(array);
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
    for(int i = 0; i < numbers.length; i++) {
      System.out.println("Number " + (i + 1) + ": " + numbers[i]);
    }
  }

  // method that takes an array of ints and returns an array of ints that is
  //  the same as the original but with a reversed order
  private static int[] reverse(int[] numbers) {
    int[] result = new int[numbers.length];
    int idx = numbers.length - 1;
    for(int i = 0; i < numbers.length; i++) {
      result[i] = numbers[idx];
      idx -= 1;
    }
    return result;
  }

  // method that takes an array of ints and returns an array of ints that is
  //  the original array repeated twice
  private static int[] duplicate(int[] numbers) {
    int[] result = new int[numbers.length * 2];
    for(int i = 0; i < numbers.length * 2; i++) {
      result[i] = numbers[i % numbers.length];
      // by using mod, we cycle
      // for example, if length is 1
      // 0 % 2 = 0
      // 1 % 2 = 1
      // 2 % 2 = 0
      // 3 % 2 = 1
    }
    return result;
  }
}
