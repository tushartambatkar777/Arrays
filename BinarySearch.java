public class BinarySearch {
  public static int binary_search(int number[], int key) {
    int n = number.length;
    int start = 0;
    int end = n-1;

    while(start<=end) {
      int mid = (start + end) / 2;

      if(number[mid] == key) {
        return mid;
      }

      if(number[mid] < key) {
        start = mid+1;
      }else{
        end = mid-1;
      }
    }
    return -1;
  }
  public static void main(String args[]) {
    int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int key = 4;
    System.out.println("Index for key is: "+ binary_search(number, key));
  }
}

/*Time complaxity = O(logn) 
  Space complaxity = O(1)
*/