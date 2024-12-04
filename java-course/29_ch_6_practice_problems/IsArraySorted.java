public class IsArraySorted {
   public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 3};

      boolean isSorted = true;
      for (int i = 0; i < arr.length; i++) {
         if (i == arr.length-1) {
            break;
         }
         if (arr[i] > arr[i+1]) {
            isSorted = false;
            break;
         }
         
      }

      if (isSorted) {
         System.out.println("Array is sorted");
      } else {
         System.out.println("Array is not sorted");
      }
      
   }
}
