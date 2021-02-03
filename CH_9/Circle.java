package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_9;

public class Circle extends Shape
{
     private double radius;

     public void setRadius(double r)
     {
          radius = r;
          setArea(Math.PI * r * r);
     }

     public double getRadius()
     {
          return radius;
     }
};
