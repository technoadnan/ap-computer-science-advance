public class ReverseAnArray {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[] reversedArr = new int[arr.length];
      for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
         reversedArr[i] = arr[j];
      }
      for (int i = 0; i < reversedArr.length; i++) {
         System.out.print(reversedArr[i] + " ");
      }
   }
}
