public class detectDoubleTripleSpace {
   public static void main(String[] args) {
      String name = "name ";
      System.out.println(name.indexOf("   ")); // 3 space
      System.out.println(name.indexOf("  ")); // 2 space
      // if its -1 then there is not Space
   }   
}
