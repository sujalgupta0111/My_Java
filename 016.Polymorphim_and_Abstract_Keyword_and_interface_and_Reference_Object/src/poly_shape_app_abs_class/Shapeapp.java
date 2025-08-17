package poly_shape_app_abs_class;

public class Shapeapp {

	public static void main(String[] args) 
	{
		Shape s;
		//s= new Shape();//erroe as shape is abstract class;
		
		
		 s= new Circle();
		 s.area();
		 s.print();
		 
				 s= new Rectangle();
		 s.area();
		 s.print(); 
		 
	
		 s= new Square();
		 s.area();
		 s.print();
		 
		
		 s= new Triangle();
		 s.area();
		 s.print(); 
		 
		 
		 
		

	}

}
