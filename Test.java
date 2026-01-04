public class Test {
    public static void main (String [] args){
        //test circle
        Circle c1 = new Circle ();
		Circle c2 = new Circle(2.0);
		Circle myCircle = new Circle(3.97,"Green");
		
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(myCircle.toString());
		System.out.println();

		c1.setColor("green");
		System.out.println(c1.toString());
		System.out.println();

        //test cylinder
        Cylinder mycy = new Cylinder(); //Up Casting
		Cylinder mycy1 = new Cylinder(20.0,7.0,"blue");
		//Cylinder cy1 = (Cylinder) c1; //Down Casting
		
		System.out.println("=======MY CYLINDER======== \n"+mycy.toString());
		System.out.println();
		System.out.println();
		System.out.println("=======MY CYLINDER======== \n"+mycy1.toString());
		// System.out.println();
		// System.out.println("=======MY CYLINDER======== \n"+cy1.toString());

		System.out.println();
		System.out.println(c1 instanceof Circle);
		System.out.println(c1 instanceof Cylinder);
		System.out.println(mycy instanceof Circle);
		System.out.println(mycy instanceof  Cylinder);
    }    
}
