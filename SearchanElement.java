public class SearchanElement {
  public static int search(int arr[], int N, int X) {
    for(int i=0; i<N; i++) {
      if(arr[i] == X) {
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String args[]) {
    int arr[] = {1,2,3,4};
    int X = 7;
    int N = 4;
    System.out.println("X at index is: "+ search(arr, N, X));
  }
}

/*Time complaxity = O(n) 
  Space complaxity = O(1)
*/
