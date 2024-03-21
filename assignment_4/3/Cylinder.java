import java.lang.Math;
class Cylinder extends Circle{
	double height = 1.0;
	public Cylinder(){

	}
	public Cylinder(double radius){
		super(radius);
	}
	public Cylinder(double radius,double height){
		super(radius);
		this.height = height;
	}
	public Cylinder(double radius,double height,String color){
		super(radius);
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		height = this.height;
	}
	public double getVolume(){
		return (Math.PI*radius*radius*height);
	}
}
