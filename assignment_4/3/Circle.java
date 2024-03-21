import java.lang.Math;
class Circle{
	double radius=1.0;
	String color="red";
	public Circle(){

	}
	public Circle(double radius){
		this.radius=radius ;
	}
	public Circle(double radius,String color){

		this.radius=radius;
		this.color=color;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public String getColor(){
		return color;
	}
	public void setColor(){
		this.color=color;
	}	
	public double getArea(){
		return (Math.PI*radius*radius);
	}
	public String toString(){
		String s = "Circle[radius="+radius+",color="+color+"]";
		return s;
	}
}
