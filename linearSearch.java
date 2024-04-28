public class linearSearch {
  public static int linear_search(int number[], int key) {
      for(int i=0; i<=number.length; i++) {
         if(number[i] == key) {
           return i;
         }
      }
      return -1;
   }
   public static void main(String args[]) {
      int number[] = {2, 4, 1, 5, 6, 7, 8, 9, 10, 44, 67, 77, 66, 33};
      int key = 77;
     
      int index = linear_search(number, key);
      if(index == -1) {
         System.out.println("Not Found");

      } else{
         System.out.println("Key is at index : "+index);
      }
   }
}


/*Time complaxity = O(n)
  Space complaxity = O(1)
*/