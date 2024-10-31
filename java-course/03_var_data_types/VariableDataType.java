public class VariableDataType {

   /****** Rules of defining a variable ******/
   // Must not begin with a digit
   // Name is case-sensitive
   // Should not be a keyword
   // No whitespace allowed


   /* Primitive Data Types */
   // byte -> 1 byte
   // short -> 2 bytes
   // int -> 4 bytes
   // float -> 4 bytes
   // long -> 8 bytes
   // double -> 8 bytes
   // char -> 1 byte
   // boolean -> 1 byte

   public static void main(String[] args) {

      // Integer types
      byte rollNumber = 45; // Range: -128 to 127
      short weeklySalary = 2000; // Range: -(2^16)/2 to (2^16)/2 - 1; -1 b/c of 0
      int annualSalary = 90000; // Range: -(2^32)/2 to -(2^32)/2 -1 
      long populationOfWorld = 7900000000L; // Range: -(2^64)/2 to (2^64)/2 - 1 (suffix 'L' for long literals)

      // Floating-point types
      float avg = 98.45f; // 6 to 7 decimal 
      double pie = 3.1415926535f; // 15 to 16 decimal

      // Character type
      char letter = 'a'; // Range: 0 to (2^16 - 1)

      // Boolean type
      boolean lightIsOn = true; // depends

   }
}



