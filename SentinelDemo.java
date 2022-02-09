import java.util.Scanner;

class SentinelDemo {

  public static void main(String[] args) {
    // Declare and initialize variables
    int count = 0;
    int input = -1;

    // Set up Scanner object
    Scanner scan = new Scanner(System.in);

    // priming read
    System.out.print("Integer: ");
    input = scan.nextInt( );

    // Let's use a while loop to keep inputting
    // NON-ZERO integers via keyboard
    // 0 is sentinel value (a value that is "unwanted"/"Stands out")
    while ( input != 0 ) {
      // Increment counter
      count++;

      // Input another integer
      System.out.print("Integer: " );
      input = scan.nextInt( );
    }
    
    System.out.println("Count is " + count);
  }

}
