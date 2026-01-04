public abstract class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }

    public Shape(){
        this.color="White";
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public abstract double getArea();
      
    public String toString() {
        return "Color = " + this.getColor() + "\nArea = " + this.getArea();
    }
}