public class Cylinder extends Circle{
	private double height;

	public final double DEFULT_HEIGHT = 20.0;
	
	public Cylinder(){
		this.height = DEFULT_HEIGHT;
	}
	public Cylinder(double height){
		this.height=height;
	}
	public Cylinder(double height, double radius){
		super (radius);
		this.height = height;
	}
	public Cylinder(double height, double radius, String color){
		super (radius, color);
		this.height = height;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getVolume() {
        return getArea() * height;  // area from Circle
    }
	
	@Override
	public double getArea(){
		return 2.0*Math.PI*getRadius()*height;
	}
	@Override
	public String toString() {
        return super.toString() +  // Circle's toString (radius and colour)
               "\nHeight of the cylinder: " + height +
               "\nVolume of the cylinder: " + getVolume();
    }
}