import java.sql.*;

public class Read_single {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		    Statement st=c.createStatement();
		    
/*Use executeQuery to retrieve data from the database 
   (instead of executeUpdate, which is for updates).

executeQuery returns a ResultSet object that initially points before the first row
 of results.

Use .next() to move the cursor to the next row, allowing access to the data.

Retrieve column values with methods like .getInt() and .getString() 
to print or process the results.*/
			
			
			ResultSet rs=st.executeQuery("SELECT * FROM employee WHERE id=50");
			System.out.println(rs );
		
			if(rs.next())//rs.next return true until it found data in te row 
			{
				/*int ab = rs.getInt("id");
				//getInt("name of the coulumn must me same as inside the table ");
				String xy =rs.getString("adress");
				int salary =rs.getInt("salary");*/
				
				//or
				
				int ab = rs.getInt(1);
				//getInt(" coulumn position in table");
				String xy =rs.getString(5);
				int salary =rs.getInt(3);
				
				//print
				System.out.println("id:-"+ab);
				System.out.println("adress:-"+xy);
				System.out.println("adress:-"+salary);
//								
			}/*else {
				System.out.println("Data Not FOUND!");
			}*/
			c.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
