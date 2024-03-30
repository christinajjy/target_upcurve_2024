import java.lang.Math;
public class Circle extends Shape{
    private double radius =1.0;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public String toString(){
        return "Cirle[radius="+radius+super.toString()+"]";
    }
}
