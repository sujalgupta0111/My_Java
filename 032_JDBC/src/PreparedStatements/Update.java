//PreparedStatement are useful is you have to perform queries multiple times 
// here we use ? for the value that we want to give 

package PreparedStatements;
import java.sql.*;
public class Update {

	public static void main(String[] args) {
		Connection abc = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 abc = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		 //PreparedStatement p=abc.prepareStatement("DELETE FROM employee WHERE salary=? and cname=?");
		 	
			/*p.setInt(1, 600);
			p.setString(2, "prachi Gupta ");*///-->Data not found
		 
		 
		 PreparedStatement p=abc.prepareStatement("DELETE FROM employee WHERE salary=? or cname=?");
		 p.setInt(1, 500);
		 p.setString(2, "a");
		 int r=p.executeUpdate();
			
		 if(r==0) {
				System.out.println("Data Not FOUND!");
			}else {
				System.out.println("Data Deleted Successfully!");
			}
			
			abc.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
