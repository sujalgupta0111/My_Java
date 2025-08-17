//PreparedStatement are useful is you have to perform queries multiple times 
// here we use ? for the value that we want to give 

package PreparedStatements;
import java.sql.*;
public class Delete {

	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		/*	PreparedStatement p=c.prepareStatement("UPDATE employee SET name='Sadhav Sharma',salary=salary+10000 WHERE id=?");
			p.setInt(1, 5);*/
			
			PreparedStatement p=c.prepareStatement("UPDATE employee SET name=?,salary=?+10000 WHERE id=?");
			p.setString(1, "Sujal Gupta");
			p.setInt(2, 500000000 );
			p.setInt(3, 5);
			
			int r=p.executeUpdate();
			if(r==0) {
				System.out.println("Data Not FOUND!");
			}else {
				System.out.println("Data Updated Successfully!");
			}
			
			c.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
