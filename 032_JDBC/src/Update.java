import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String name ="pawan Gupta " ;
			int salary = 900000;
		    Connection ab = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		    Statement st = ab.createStatement();
		    
		    //enter update queries 
		    int r = st.executeUpdate("UPDATE employee SET name='Sujal Gupta',salary = 9000000 WHERE id=1");
		 // this method return int value , value is equal to no of query execute
			System.out.println("Susessfully done "+ r +" total queries execution");    
		
		 }catch(ClassNotFoundException | SQLException b)
		{
			b.printStackTrace();
		}

	}

}
