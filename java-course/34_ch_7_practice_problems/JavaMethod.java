public class JavaMethod {
   public static void multiplicationTable(int n){
      // while (n > 0) {
      //    System.out.print(n+" ");
      // }

      for (int i = 1; i <= 10; i++) {
         System.out.println(n+" x "+i+" = "+n*i);
         // System.out.print();
      }


   }
   public static void main(String[] args) {
      multiplicationTable(4);
   }
}