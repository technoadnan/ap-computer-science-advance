// package java-course.30_methods;


// another name of method is called function in other programming language    
public class Methods {

   // 
   static int mySum1(int a, int b) {
      return a+b;
   }

   int mySum(int a, int b) {
      int c = a+b;
      return c;	//Return value
   }

   public static void main(String[] args) {
      int result = mySum1(5,11);
      System.out.println(mySum1(4, 5));
      System.out.println(result);

      // calling the method() with instance 
      // method invocation using obj creation

      Methods a = new Methods(); // obj creation
      int t = a.mySum(34, 3);
      System.out.println(t);

      
   }
}