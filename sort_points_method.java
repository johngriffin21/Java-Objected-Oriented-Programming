//Sort Points from the based on distance from origin

import static java.lang.Math.sqrt;

public class Point implements Order
{
    private double x, y;
    
    public Point(double newX, double newY)
    {
        this.x = newX;
        this.y = newY;
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }
    public boolean lessThan(Order other)
    {
    Point otherPoint = (Point) other; 
    double distance1 = Math.sqrt((this.x*this.x) + (this.y*this.y));
    double distance2 = Math.sqrt((otherPoint.x*otherPoint.x) + (otherPoint.y*otherPoint.y));
    if (distance1 < distance2) 
    {
        return true;
    }
    else if (distance1 > distance2) 
    {
        return false;
    }
    return true;
    }
}