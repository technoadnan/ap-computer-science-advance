class Base1{
   Base1(){
      System.out.println("I am a constructor");
   }
   Base1(int x){
      System.out.println("I am an overloaded constructor with value of x as: " + x);
   }
}

class Derived1 extends Base1{
   // base will run at first then 
   // derived 
   Derived1(){
      //super(0);
      System.out.println("I am a derived class constructor");
   }
   Derived1(int x, int y){
      super(x);
      System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
   }
}


public class ConstructorInheritence {
   public static void main(String[] args) {

      Derived1 obj1 = new Derived1();
      Derived1 obj2 = new Derived1(10, 20);
   }
}
