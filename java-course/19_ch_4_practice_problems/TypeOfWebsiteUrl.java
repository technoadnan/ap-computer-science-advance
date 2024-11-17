public class TypeOfWebsiteUrl {
   public static void main(String[] args) {
      String COM = "Commercial Website";
      String ORG = "Organizational Website";
      String IN = "Indian Website";

      String name = "adnan.com";

      int stringAfterDot = name.indexOf(".");

      String domainName = name.substring(stringAfterDot+1, name.length()); // shortcut endswith

      if ("com".equals(domainName)){
         System.out.println(COM);
      }
      else if ("org".equals(domainName)) {
         System.out.println(ORG);
      }
      else if ("in".equals(domainName)) {
         System.out.println(IN);
      }
      else{
         System.out.println("Invalid");
      }


   }
}
