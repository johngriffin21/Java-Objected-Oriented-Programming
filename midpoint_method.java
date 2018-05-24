//Write a midPoint method of the point class which calculates the mid point between the point and another point which is passed as a parameter. 


public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      this.x = newX;
      this.y = newY;
   }
   
   public Point midPoint(Point new_point){
      double z = (this.x + new_point.x)/2;
      double y = (this.y + new_point.y)/2;
      Point p3 = new Point(z, y);
      return p3;
   }
   
   
   
   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}