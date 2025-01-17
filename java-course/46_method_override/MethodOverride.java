class A {
   public int a;
   public void prints(){
      System.out.println("Printing smth"+a);
   }
   public void myMethod(int a) {
      System.out.println(a);
   }
}

class B extends A{
   @Override
   public void prints() {
      System.out.println("printing B");
   }
   // this is not a override method since A has perameterized while Mymethod of B doesn't
   public void myMethod(){
      System.out.println(a);
   }
}



public class MethodOverride {
   public static void main(String[] args) {
      B abc = new B();
      abc.prints();
   }   
}
