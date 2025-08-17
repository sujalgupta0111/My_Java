package poly_interface_shape_app;

public class Circle implements Shape
{
  private double a ;
	
  public void area()
/*as interface method by default public and abstract then it is required to make \
  the method public here
 */
  {
	  a= 3.14*9*9;
  }
  public void  print()
  {
	  System.out.println("Area of Circle -->"+a);
  }
  

}
