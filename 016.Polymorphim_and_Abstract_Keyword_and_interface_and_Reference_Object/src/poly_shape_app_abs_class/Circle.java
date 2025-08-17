package poly_shape_app_abs_class;

public class Circle extends Shape
{
  private double a ;
	
  void area()
  {
	  a= 3.14*9*9;
  }
  void print()
  {
	  System.out.println("Area of Circle -->"+a);
  }
  

}
