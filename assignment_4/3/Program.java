class Program{
	public static void main(String[] args){
		Circle[] circles={
			new Cylinder(12.34),
			new Cylinder(12.34,10.0),
			new Cylinder(12.34,10.0,"blue") 
		};
		System.out.println(circles[0].getArea());
		System.out.println(((Cylinder)circles[0]).getVolume());
		System.out.println(circles[1].getArea());
		System.out.println(((Cylinder)circles[1]).getVolume());
		System.out.println(circles[2].getArea());
		System.out.println(((Cylinder)circles[2]).getVolume());

	}
}
