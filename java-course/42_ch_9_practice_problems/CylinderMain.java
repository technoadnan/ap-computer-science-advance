




public class CylinderMain {
   public static void main(String[] args) {
      Cylinder cy = new Cylinder();
      cy.setRadius(34);
      cy.setHeight(34);
      int a = cy.CalculateSurfaceArea(2);
      System.out.println(a);
   }


}


class Cylinder {
   private int radius;
   private int height;

   public Cylinder(int height, int radius) {
      this.height = height;
      this.radius = radius;
   }
   
   public void setRadius(int n){
      this.radius = n;
   } 

   public int getRadius(){
      return radius;
   }

   public void setHeight(int n){
      this.height = n;
   }

   public int getHeight(int n) {
      return height;
   }


   public int CalculateSurfaceArea(int radius) {
      return (int)(4*Math.PI*(Math.pow(radius, 2)));
   }



}