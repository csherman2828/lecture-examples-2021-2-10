
public class ArrayDemo {
  public static void main(String[] args) {
    int[] anArray = {34, 94, 87, 34, 56};
    anArray = {3, 9, 87, 34, 56};

    int myInt = 5;

    for (int i = 0; i < anArray.length; i++){
      System.out.println("Element at index " + i +" : " + anArray[i]);
    }
    System.out.println("Lenght of anArray: " + anArray.length);
  }
}
