class One {

   int a = 45;
   public One() {
      System.out.println("Hlw, I am one");
   }

   void show() {
      System.out.println("inside One");
      // System.out.println(a);
   }
   
}

class Two extends One{

   public Two() {
      // Java adds the super keyword automatically 
      System.out.println("Hlw, I am two");
   }

   void show() {
      super.show();
      int a = 34;
      System.out.println(a);
      System.out.println(super.a);
   }

   
}


public class ThisSuper {
   public static void main(String[] args) {
      Two var = new Two();
      System.out.println(var.a);
      var.show();
   // Super keyword 
   // to access same var or function use super keyword to access
   // when extends a classs, of that class have a constructor
   // then it will call automatically when defined
   
   // if the constructor have parameter then it must be used otherwise error
   


   }
}
