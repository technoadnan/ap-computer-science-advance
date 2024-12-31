public class EmployeeClass {
   
   static class Employee {
      // int a = 56;
      int salary = 120000;
      int getSalary(){
         return salary;
      }

      static String name = "Adnan";
      String getName(){
         return name;
      }

      String setName(String n) {
         name = n;
         return name;
      }
   }
   
   public static void main(String[] args) {
      Employee e = new Employee();

      System.out.println(e.getSalary());
      System.out.println(e.getName());
      System.out.println(e.setName("n"));

   }   
}
