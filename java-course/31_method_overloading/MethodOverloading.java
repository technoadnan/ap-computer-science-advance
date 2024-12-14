public class MethodOverloading {
   
   // int vs array changes 
   static void num(int n){
      n = 56;
   }

   static void change(int[] arr){
      arr[0] = 29;
   }


   // method overloading examples
   static int sum(int a,int b){
      return a+b;
   }
   
   static int sum(int a,int b, int c){
      return a+b+c;
   }

   /* ERROR */
   // static int sum(int a,int b, int c){
   //    return a+b+c;
   // }

   /****
    * we can't change return to overload
    * only by changing parameters 
   ****/


   
   public static void main(String[] args) {

      // Int 
      int x = 87;
      num(x); // doesn't impose 56
      // System.out.println(x); // 87

      // Array
      int[] arr = {45,45,4,65,6};
      for (int i : arr) {
         System.out.println(i);
      }
      System.out.println("-----");
      change(arr);
      for (int i : arr) {
         System.out.println(i); // changed the value for 0th index 
         // the change happens because the array use reference(Adress)
         // reference passed as parameters 
      }




      /* method overloading examples */

      // same function name can be def only if the parameters are changed 
      // System.out.println(sum(4, 3));
      // System.out.println(sum(4, 3,4));


   }   
}
