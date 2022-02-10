import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    char choice;

    do {
      printMenu();
      choice = userInput.nextLine().charAt(0);

      // if(choice == 'A') {
      //   System.out.println("You chose A");
      // }
      // else if(choice == 'B') {
      //   System.out.println("You chose B");
      // }
      // else if(choice == 'C') {
      //   System.out.println("You chose C");
      // }
      // else if(choice == 'X') {
      //   System.out.println("Exitting...");
      // }
      // else {
      //   System.out.println("Please choose a valid option...")
      // }

      switch(choice) {
        case 'A':
          System.out.println("You chose A");
          break;
        case 'B':
          System.out.println("You chose B");
          break;
        case 'C':
          System.out.println("You chose C");
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
    System.out.println("\t A. Option A");
    System.out.println("\t B. Option B");
    System.out.println("\t C. Option C");
    System.out.println("\t X. Exit");
    System.out.print("> ");
  }
}
