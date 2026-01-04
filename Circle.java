public class Circle extends Shape{
	private double radius;
	
	public static final double DEFAULT_RADIUS=1.0;
	public static final String DEFAULT_COLOUR="red";
	
	public Circle(){
		super(DEFAULT_COLOUR);
		this.radius=DEFAULT_RADIUS;
	}
	public Circle(double radius){
		super(DEFAULT_COLOUR);
		this.radius=radius;
	}
	public Circle(double radius, String color){
		super(color);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	@Override
	public double getArea(){
		return radius*radius*Math.PI;
	}

	public void setRadius(double radius){
		this.radius=radius;
	}

	@Override
	public String toString(){
		return "Radius of the circle is : "+this.getRadius()+"\nColour of the circle is : "+this.getColor();
	}
}