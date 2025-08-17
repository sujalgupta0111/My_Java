package poly_interface_shape_app;

public class Square implements Shape{

	
		  private double a ;
			
		 public void area()
		  {
			  a= 9*9;
		  }
		 public  void print()
		  {
			  System.out.println("Area of Circle -->"+a);
		  }

}
