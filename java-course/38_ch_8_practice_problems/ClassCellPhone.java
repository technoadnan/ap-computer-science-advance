public class ClassCellPhone {
   
   static class CellPhone {
      void ringing() {
         System.out.println("Ringing...");
      }
      void vibrating() {
         System.out.println("vibrating...");
      }
   }
   
   public static void main(String[] args) {
      CellPhone cell = new CellPhone();
      cell.ringing();
      cell.vibrating();
   }
   
}
