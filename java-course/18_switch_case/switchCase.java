public class switchCase {
   public static void main(String[] args) {
      int age = 5;
      switch (age) {
         case 18:
            System.out.println("the age is 18");
            break;
         case 5:
            System.out.println("the age is 5");
         default:
            break;
      }

      // switch cases can also be string and char

      // smart switch cases
      String name = "Adnan1";
      switch (name) {
         case "Adnan" -> System.out.println("Adnan is printed");
         case "cat" -> System.out.println("Cat is printed");
         default -> System.out.println("All are done");
      }
   }   
}
