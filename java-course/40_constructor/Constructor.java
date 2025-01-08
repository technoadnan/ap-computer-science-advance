/* Rules for creating a Constructor :
   * The class name and constructor name should be the same.
   * It must have no explicit return type.
   * It can not be abstract, static, final, and synchronized.
*/

/* 
 * Defaut constructor : A constructor with 0 parameters is known as default constructor.
 * Paramerterized constructor : A constructor with some specified number of     parameters is known as a parameterized constructor.
*/

class MyMainEmployee {
   private int id;
   private String name;

   // both id and name 
   public MyMainEmployee(){
      id = 45;
      name = "hello";
   }
   public MyMainEmployee(int myId, String myName){
      id = myId;
      name = myName;
   }

   public void setName(String n) {
      this.name = n;
   }
   public String getName() {
      return name;
   }
   public void setId(int n){
      id = n;
   }
   public int getId(){
      return id;
   }

}

public class Constructor {
   public static void main(String[] args) {
      MyMainEmployee adnan = new MyMainEmployee();
      // adnan.setId(23);
      System.out.println(adnan.getName());

      MyMainEmployee john = new MyMainEmployee(34,"john");
      System.out.println(john.getName());
   }
}
