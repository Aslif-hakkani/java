public class Circleup{
	private double radius;
	private String colour;
	private Point center;
	
	public final double DEFAULT_RADIUS=1.0;
	public final String DEFAULT_COLOUR="red";
	public final Point DEFAULT_CENTER= new Point(1,1);
	
	public Circleup(){
		this.radius=DEFAULT_RADIUS;
		this.colour=DEFAULT_COLOUR;
		this.center=DEFAULT_CENTER;
	}
	public Circleup(double r){
		radius=r;
		colour=DEFAULT_COLOUR;
		this.center=DEFAULT_CENTER;
	}
	public Circleup(double r, String c,Point p){
		radius=r;
		colour=c;
		center=p;
	}
	public Circleup(double r, String c,int x,int y){
		radius = r;
		colour = c;
		this.center=new Point (x,y);
	}
	
	public double getRadius(){return radius;}
	public String getColour(){return colour;}
	public Point getCenter(){return this.center;}
	public double getArea(){return radius*radius*Math.PI;}
	public int getX(){return this.center.getX();}
	public int getY(){return this.center.getY();}
	

	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public void setCenter(int x,int y)
	{
		this.center=new Point (x,y);
	}

	public String toString(){
		return "The radius of circle is : "+this.getRadius()+"\nColour of the circle is : "+this.getColour()+"\nCenter of the circle is :"+center.toString();
	}
}