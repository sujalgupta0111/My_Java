package PreparedStatements;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadMultiple {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Chirag@0111");
			//PreparedStatement p=c.prepareStatement("SELECT * FROM employee");
			PreparedStatement p=c.prepareStatement("SELECT * FROM employee WHERE name LIKE ?");
			
			//p.setString(1, "%r%");
			//p.setString(1, "%r");
			p.setString(1, "r%");
			
			ResultSet rs=p.executeQuery();
			System.out.println(rs);
			boolean flag=true;
			while(rs.next()) {
				flag=false;
				int i=rs.getInt("id");
				String n=rs.getString("name");
				int s=rs.getInt("salary");
				String cn=rs.getString("cname");
				String a=rs.getString("address");
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

