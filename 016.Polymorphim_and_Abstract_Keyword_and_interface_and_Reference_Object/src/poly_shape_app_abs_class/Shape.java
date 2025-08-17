//as shape is abstract class now then its object is not created
package poly_shape_app_abs_class;

abstract public class Shape 
{
	
	abstract void area();
	// these method are abstract method they don't have a body and ends with semicolon
	//it compulsory for child class to overridden t abstract method of parent class
		  
	abstract  void print();
	
	//abstract  void print1();//error
	/*As print1() do not present in any of the class so then this show the error 
	  in all the child class of this class*/

		 
}