public class MissingelementofAP {
  public static int findMissing(int[] arr, int n) {
    int diff = (arr[n-1] - arr[0]) / n;
    for(int i=0 ;i<n; i++) {
      if(arr[i]+diff != arr[i+1]) {
        return arr[i]+diff;
      }
    }
    return -1;
  }
  
  public static void main(String args[]) {
    int arr[] = {2, 4, 8, 10, 12, 14};
    int n = 6;
    System.out.println("Missing element of AP is: "+ findMissing(arr, n));
  }
}


/*Time complaxity = O(n) 
  Space complaxity = O(n)
*/