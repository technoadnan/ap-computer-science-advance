class Rect{
   public int l;
   public int w;

   public int RectangleFormula() {
      return this.l*this.w;
   }
}


class Cuboid extends Rect{
   public int h;
   public int CuboidFormula() {
      return this.l*this.w*this.h;
   }
}


public class RectInheritence {
   public static void main(String[] args) {
      Rect r = new Rect();
      r.l= 5;
      r.w= 5;
      System.out.println(r.RectangleFormula());

      Cuboid c = new Cuboid();
      c.h = 4;
      c.l = 4;
      c.w = 4;
      System.out.println(c.CuboidFormula());

   }
}
