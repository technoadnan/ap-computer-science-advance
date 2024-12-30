class Employee {
   int id; // atrribute 1 
   String name; // atrribute 2
   public void printDetails() {
      System.out.println(name);
      // String name = "inner";
   }
}



public class FirstClass {
   // there could be only one class in a java file

   // class inside a class
   // static class Employee{}
   


   public static void main(String[] args) {
      // there could be only one class in a java file 
      Employee harry = new Employee();
      // harry.printDetails(); // if it seted before the initialization then it will return NULL

      // setting attributes
      harry.id = 12;
      harry.name = "adnan";

      harry.printDetails(); 


   }   
}
