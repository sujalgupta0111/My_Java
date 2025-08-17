//PreparedStatement are useful is you have to perform queries multiple times 
// here we use ? for the value that we want to give 

package PreparedStatements;
import java.sql.*;
public class Resultsetmetadata {

	public static void main(String[] args) {
		Connection abc = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 abc = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		
		 /*For prepared Statements*/
PreparedStatement p = abc.prepareStatement("SELECT * FROM employee WHERE id>?");
p.setInt(1, 3);
ResultSet ab =p.executeQuery();//executeQuery(); return the object which point above the desire value


ResultSetMetaData meta = ab.getMetaData();
//getMetaData(); this return the object which stores the Object of  other
System.out.println(meta.getColumnClassName(1));//tell the class from which column belongs 
System.out.println(meta.getColumnName(3));//tell the name of coulumn
System.out.println(meta.getColumnCount());//tell the no of coulumn in table
System.out.println(meta.getColumnTypeName(4));//return the column data type

		 
		 
		 /*For Statement */
		   /* Statement st=abc.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM employee WHERE id=5");
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getColumnName(3));
			System.out.println(rsmd.getColumnTypeName(4));
			System.out.println(rsmd.getColumnCount());*/
		abc.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
