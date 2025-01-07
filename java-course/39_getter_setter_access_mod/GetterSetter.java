class MyEmployee{
   private int id;
   private String name;

   // to access private variable we have to use getter and setter

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


public class GetterSetter {
   public static void main(String[] args) {
      MyEmployee adnan = new MyEmployee();
      adnan.setId(45);
      System.out.println(adnan.getId());

      adnan.setName("adnan");
      System.out.println(adnan.getName());

   }
   
}