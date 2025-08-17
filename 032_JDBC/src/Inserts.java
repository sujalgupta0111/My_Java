import java.sql.*;
public class Inserts {

	public static void main(String[] args) 
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String name =" rajpal Gupta" ;
			int salary = 90;
		    Connection ab = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		    Statement st = ab.createStatement();
		    int r = st.executeUpdate("INSERT INTO employee (name, salary, cname, adress) VALUES ('" + name + "', " + salary + ", 'microsoft', 'bsr up')");
			System.out.println("Susessfully done "+r);    
		
		 }catch(ClassNotFoundException | SQLException b)
		{
			 
			b.printStackTrace();
		}
	}

}
