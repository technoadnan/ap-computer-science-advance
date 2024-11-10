public class introStrings {
   public static void main(String[] args) {
      String name = new String();
      // System.out.println(name);

      // String name = "Adnan"; // err
      // Strings are immutable 

      String firstName = "Adnan";
      String lastName = "Alam";


      // Differences of Prints 
      System.out.println(firstName); // gives a space at the end
      System.out.println(lastName); // + is necc to concatenate 

      System.out.print(firstName); // no space at all 
      System.out.print(lastName); // comma is necc to concatenate

      // for the sake of clarity a new line is issued
      System.out.println();

      System.out.printf("%s %s",firstName,lastName); // format specifier & format specifier is necc to concatenate



   }   
}
