


public class CylinderMain {
   public static void main(String[] args) {
      Cylinder cy = new Cylinder();
      cy.setRadius(34);
      cy.setHeight(34);

      
   }
}


class Cylinder {
   private int radius;
   private int height;
   
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



}