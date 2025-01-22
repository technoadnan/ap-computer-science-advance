public class AbstractClassMethod {
   
   abstract static class Parent {
      public Parent() {
         System.out.println("Constructor");
      }
      public void sayHello() {
         System.out.println("Hello");
      }
      abstract public void greet();
   }

   static class child1 extends Parent {
      @Override
      public void greet() {
         System.out.println("Good Morning");
      }
   }

   static class child2 extends Parent {
      @Override
      public void greet() {
         System.out.println("Good Evening");
      }

      public void hello() {
         System.out.println("hello");
      }
   }

   public static void main(String[] args) {
      child1 c1 = new child1();
      c1.greet();

      child2 c2 = new child2();
      c2.greet();
      c2.hello();
   }   
}