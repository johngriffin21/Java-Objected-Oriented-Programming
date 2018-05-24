
//Create a Circle class which extends Shape. The Shape method is defined below:
public class Circle extends Shape 
{
    private double radius;
    public Circle(String x, Double r){
        super(x);
        radius = r;
    }
    double area()
    {
        return (radius*Math.PI)*(radius*Math.PI);
    }
}