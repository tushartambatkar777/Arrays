public class MinandMax {
  public static int getminandmax(int number[]) {
    int Min = Integer.MAX_VALUE;
    int Max = Integer.MIN_VALUE;

    for(int i=0; i<number.length; i++) {
      if(Min > number[i]) {
        Min = number[i];
      }

      if(Max < number[i]) {
        Max = number[i];
      }
    }
    System.out.println("Minimum value is: "+ Min);
    return Max;
  }
  public static void main(String args[]) {
    int number[] = {55, 33, 77, 90, 14, 77};
    int result = getminandmax(number);
    System.out.println("Maximum value is: "+ result);
  }
}    


/*Time complaxity = O(n) 
  Space complaxity = O(1)
*/