package CirCle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle(double radius){
        this.radius=radius;
    }
    Circle(){}
 public Double getRadius(){
  return radius;
 }
 public Double getArea(){
        return (radius*2)*Math.PI;
 }

}
