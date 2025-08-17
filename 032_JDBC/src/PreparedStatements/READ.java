//PreparedStatement are useful is you have to perform queries multiple times 
// here we use ? for the value that we want to give 

package PreparedStatements;
import java.sql.*;
public class READ {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
			
			//PreparedStatement p=c.prepareStatement("SELECT * FROM employee");
			PreparedStatement p=c.prepareStatement("SELECT * FROM employee WHERE name LIKE ?");
			
			//p.setString(1, "%r%");
			//p.setString(1, "%r");
			p.setString(1, "s%");
			
			ResultSet rs=p.executeQuery();
			
			
			boolean flag=true;
			while(rs.next()) {
				flag=false;
				
				
				int i=rs.getInt("id");
				String n=rs.getString("name");
				int s=rs.getInt("salary");
				String cn=rs.getString("cname");
				String a=rs.getString("adress");
				//.getString(name of column same as in table ));
				
				
				
				//print the Obtain values 
				System.out.println("ID: "+i);
				System.out.println("Name: "+n);
				System.out.println("Salary: "+s);
				System.out.println("Company Name: "+cn);
				System.out.println("Address: "+a);
				
			}
			if(flag) {
				System.out.println("Data Not FOUND!");
			}
			c.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
