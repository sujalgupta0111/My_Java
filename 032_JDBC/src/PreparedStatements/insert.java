//PreparedStatement are useful is you have to perform queries multiple times 
// here we use ? for the value that we want to give 

package PreparedStatements;
import java.sql.*;
public class insert {

	public static void main(String[] args) {
		Connection abc = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 abc = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","Chirag@0111");
		 PreparedStatement p=abc.prepareStatement("INSERT INTO employee (name,salary,cname,ad ress) VALUES (?,?,?,?)");
		
		//TO SET VALUES WE USE .setString(),.setInt()
		//use it loop so it become easy 
		p.setString(1,"Sujal");
		p.setInt(2,677);
		// p.setString(here we have to pass the number at which ? exist like in this case  name is at 1  so here it denotes that for first ? arrives in right to left expression is string ,"the value you want to give ");
		p.setString(4,"Mujafar nagar");
		p.setString(3,"Google");
		//now to tell the copiler to execute the given Changes we use executeupdates
	int s =	p.executeUpdate();
	System.out.println(s+"--------------------------------");
		
		}catch(SQLException | ClassNotFoundException b)
		{
			b.printStackTrace();
		}finally 
		{
			try {
				abc.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		

	}

}
