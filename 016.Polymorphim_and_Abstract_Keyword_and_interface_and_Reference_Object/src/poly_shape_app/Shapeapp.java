package poly_shape_app;

public class Shapeapp {

	public static void main(String[] args) 
	{
		Shape s;
		
		//object of Circle Through Reference variable S
		 s= new Circle();
		 s.area();
		 s.print();//calling print() and area() of circle through shape .
		 
		//object of rectangle Through Reference variable S
		 s= new Rectangle();
		 s.area();
		 s.print();//calling print() and area() of rectangle through shape 
		 
		//object of square Through Reference variable S
		 s= new Square();
		 s.area();
		 s.print();//calling print() and area() of square through shape 
		 
		//object of triangle Through Reference variable S
		 s= new Triangle();
		 s.area();
		 s.print();//calling print() and area() of triangle through shape 
		 
		 
		 
		

	}

}
