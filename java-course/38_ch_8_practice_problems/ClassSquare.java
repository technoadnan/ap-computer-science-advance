class square {
   int side;
   int area() {
      return side*side;
   }
   int perimeter() {
      return 4 * side;
   }
}

class Rectangle {
   int side;
   int length;
   int width;

   int perimeter() {
      return 2*(length+width);
   }

   int area() {
      return length * width;
   }

}

class Circle {
   int radius;

   double circumference() {
      return 2*Math.PI*radius;
   }

   double area() {
      return Math.PI * Math.pow(radius, 2);
   }

}


public class ClassSquare {
   
   
   public static void main(String[] args) {
      Rectangle rect = new Rectangle();
      rect.length = 2;
      rect.width = 4;
      int a = rect.perimeter();
      System.out.println(a);


      Circle c = new Circle();
      c.radius = 3;
      System.out.println(c.area());

      


   }
}
