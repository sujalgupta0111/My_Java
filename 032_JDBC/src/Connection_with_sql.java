import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_with_sql {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String password_of_sql = "Chirag@0111";
        String local = "jdbc:mysql://localhost:3306/demo";
        
        
        try {
            Class.forName(driver);
            Connection ab = DriverManager.getConnection(local, "root", password_of_sql);
            Statement s = ab.createStatement();
            ab.close();
             
            System.out.println("Success");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
