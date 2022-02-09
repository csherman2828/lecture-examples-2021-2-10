
class ArrayDemo4 {

  public static void main(String[] args) {
    // declares an array of integers
    int [] anArray; //= {92, 94, 87, 34, 56};

    //anArray = {912, 1194, 87, 134, 56};
    // instantiate / allocates memory for 5 integers
    anArray = new int[5];

    int myInt;

    myInt = 5;
    // initialize first element
    anArray[0] = 500;
    // initialize second element
    anArray[1] = 600;
    // and so forth
    anArray[2] = 700;
    anArray[3] = 800;
    anArray[4] = 900;

    //for (int i = 0; i < anArray.length; i++){
    //	System.out.println("Element at index " + i +" : " + anArray[i]);
    //}

    int [] b;

    b = anArray;

    System.out.println("Element at index " + 0 +" : " + anArray[0]);
    System.out.println("Element at index " + 0 +" : " + b[0]);

    b[0] = -55;


    System.out.println("Element at index " + 0 +" : " + anArray[0]);
    System.out.println("Element at index " + 0 +" : " + b[0]);
    System.out.println();
    b = deepCopy(anArray);

    System.out.println("Element at index " + 0 +" : " + anArray[0]);
    System.out.println("Element at index " + 0 +" : " + b[0]);

    b[0] = -1000;


    System.out.println("Element at index " + 0 +" : " + anArray[0]);
    System.out.println("Element at index " + 0 +" : " + b[0]);

    b = null;

    System.out.println("Element at index " + 0 +" : " + b[0]);

  }

  public static int [] deepCopy(int [] original){
    int [] copy = new int[original.length];

    for (int index = 0; index < original.length; index++){
      copy[index] = original[index];
    }

    return copy;
  }
}
