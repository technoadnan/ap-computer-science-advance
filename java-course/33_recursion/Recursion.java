public class Recursion {
  // factorials
  public static int factorial(int n){
     
     if (n == 0 || n == 1){
        return 1;
     }
     return (n * factorial(n-1));
  }
  // fib
  public static int fib(int n){
     if (n == 1 || n==2) {
        return 1;
     }
     return fib(n-1) + fib(n-2);
  }
  public static void main(String[] args) {
//	   main
     // write the recursion for factorial
     // System.out.println(factorial(5));

     // fib numbers
     System.out.println(fib(7));

     // write the fib num
     // 1 1 2 3 5 8


  }   
}