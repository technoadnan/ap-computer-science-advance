public class MultidimensionalArray {
   public static void main(String[] args) {
      // when there is a array in a array
      int[] marks; // A 1-D array

      // declaration of multidim array
      int[][] flats; // A 2-D array 
      flats = new int [2][3];

      flats[0][0] = 45;
      flats[0][1] = 49;
      flats[0][2] = 25;
      flats[1][0] = 15;
      flats[1][1] = 75;
      flats[1][2] = 29;

      System.out.println(flats[0][0]);

      for (int i = 0; i < flats.length; i++) {
         for (int j = 0; j < flats[i].length; j++) {
            System.out.print(flats[i][j]);
            System.out.print(" ");
         }
         System.out.println("");
      }







   }
}
