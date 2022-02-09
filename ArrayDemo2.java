
class ArrayDemo2 {
  public static void main(String[] args) {
    // declares an array of Strings
    String[] anArray;

    // allocates memory for 5 Strings
    anArray = new String[5];

    // initialize first element
    anArray[0] = "abc";
    // initialize second element
    anArray[1] = "def";
    // and so forth
    anArray[2] = "ghi";
    anArray[3] = "jkl";
    anArray[4] = "mno";

    System.out.println("Element at index 0: " + anArray[0]);
    System.out.println("Element at index 1: " + anArray[1]);
    System.out.println("Element at index 2: " + anArray[2]);
    System.out.println("Element at index 3: " + anArray[3]);
    System.out.println("Element at index 4: " + anArray[4]);

    String [] b = null;

    b = reverse(anArray);
    System.out.println();
    System.out.println("Element at index 0: " + b[0]);
    System.out.println("Element at index 1: " + b[1]);
    System.out.println("Element at index 2: " + b[2]);
    System.out.println("Element at index 3: " + b[3]);
    System.out.println("Element at index 4: " + b[4]);
  }

  public static String [] reverse(String [] a){
    String [] reversedA = new String [a.length];

    int count = 0;

    for (int i = (a.length -1); i >= 0; i--){
      reversedA[count] = a[i];
      count++;
    }

    return reversedA;
  }
}
