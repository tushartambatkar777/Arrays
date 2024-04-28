public class Printsubarrays {
  public static void printsubarrays(int number[]) {
    for(int i=0; i<number.length; i++) {
      int start = i;
      for(int j=i; j<number.length; j++) {
        int end = j;
        for(int k=start; k<=end; k++) {
          System.out.print(number[k]+ " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    int number[] = {2, 4, 6, 8, 10};
    printsubarrays(number);
  }
}


/*Time complaxity = O(n^3) 
  Space complaxity = O(1)
*/