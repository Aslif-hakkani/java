public class Circle{
	private double radius;
	private String colour;
	
	public final double DEFAULT_RADIUS=1.0;
	public final String DEFAULT_COLOUR="red";
	
	public Circle(){
		this.radius=DEFAULT_RADIUS;
		this.colour=DEFAULT_COLOUR;
	}
	public Circle(double r){
		radius=r;
		colour=DEFAULT_COLOUR;
	}
	public Circle(double r, String c){
		radius = r;
		colour = c;
	}
	
	public double getRadius(){return radius;}
	public String getColour(){return colour;}
	public double getArea(){return radius*radius*Math.PI;}

	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColour(String colour){
		this.colour=colour;
	}

	public String toString(){
		return "Radius of the circle is : "+this.getRadius()+"\nColour of the circle is : "+this.getColour();
	}
}