public class StringMethod {
   public static void main(String[] args) {

      /*===== Strings Method ====*/
      String name = "Adnan";

      // "name" of copy
      System.out.println(name.length()); // str are immutable

      System.out.println(name.toLowerCase());

      System.out.println(name.toUpperCase());

      String trimmedString = "       Adnan         "; // trim only the leading and trailing string
      System.out.println(trimmedString.trim());

      System.out.println(name.substring(3,5)); // start included, end excluded

      System.out.println(name.replace("a", "n"));
      System.out.println(name.replace("na", "a"));

      System.out.println(name.startsWith("Ad"));

      System.out.println(name.endsWith("na"));

      System.out.println(name.equals("Adnan")); // returns boolean
      System.out.println(name.equalsIgnoreCase("adNan"));

      System.out.println(name.charAt(2));

      System.out.println(name.indexOf("a"));
      System.out.println(name.indexOf("ad")); // case-sensitive, returns - 1 b/c no matching found

      System.out.println(name.indexOf("n",3));

      System.out.println(name.lastIndexOf("a")); // string matches from ending of the str
      System.out.println(name.lastIndexOf("n",2)); // Adn -- both end and start are included


      /*===== Escape sequence =====*/
      System.out.println("I am a escape sequence \"");

   }   
}
