class Base {
   public int x;

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }
   
}

class Derived extends Base{
   public int y;

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   
}


public class Inheritence {
   public static void main(String[] args) {
      Base b = new Base();
      b.setX(56);
      System.out.println(b.getX());
      
      Derived c = new Derived();
      c.setX(45);
      System.out.println(c.getX());
      c.setY(23);
      System.out.println(c.getY());
   }
}
