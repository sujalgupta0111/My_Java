
//for multiple queries logic is same as sigle but now we use while loop 

import java.sql.*;

public class Read_multiple {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		    Statement st=c.createStatement();
		    ResultSet rs=st.executeQuery("SELECT * FROM employee WHERE id>4");
			
		    boolean flag= true ;
		
			while (rs.next())//rs.next return true until it found data in te row 
			{
				flag = false;
				/*int ab = rs.getInt("id");
				 * String na = rs.getString("name");
				//getInt("name of the coulumn must me same as inside the table ");
				String xy =rs.getString("adress");
				int salary =rs.getInt("salary");*/
				
				//or
				
				int ab = rs.getInt(1);
				String na = rs.getString(2);
				//getInt(" coulumn position in table");
				String xy =rs.getString(5);
				int salary =rs.getInt(3);
				
				//print
				System.out.println("id:-"+ab);
				System.out.println("name:-"+na);
				System.out.println("adress:-"+xy);
				System.out.println("adress:-"+salary);
//								
			}
		    if(flag) 
			{
				System.out.println("Data Not FOUND!");
			}
			c.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
