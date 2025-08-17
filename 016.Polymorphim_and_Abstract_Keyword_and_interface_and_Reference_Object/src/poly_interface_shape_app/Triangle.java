package poly_interface_shape_app;

public class Triangle implements Shape {

	
		  private double a ;
			
		  public void area()
		  {
			  a= 0.5*9*7; 
		  }
		 public  void print()
		  {
			  System.out.println("Area of triangle -->"+a);
		  }

}
