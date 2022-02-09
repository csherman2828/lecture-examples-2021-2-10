
class BreakContinue {
  public static void main(String[] args) {
    System.out.println("break: ");
    // Use break to exit the loop entirely
    for (int i = 1; i < 6; i++){
    if (i == 3) {break;}
    System.out.println(i);
    }


    System.out.println("continue: ");
    // Use continue to "skip" remaining part of one iteration
    for (int i = 1; i < 6; i++){
      if (i == 3) {continue;}
      System.out.println(i);
    }

  }
}
