//STEP 1. Import required packages
import java.sql.*;

public class JDBCExample {
    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo";

    //Database credentials
    static final String USER = "root";
    static final String PASS = "root1234";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String query = "Select * from student where rollno = 4";
            
            //STEP 5: Extract data from result set
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            //Retrieve by column name
            String sname = rs.getString(2);
            //Display values
            System.out.print("Name : " + sname);
            System.out.println("\nAshank Juyal\n45-IT-18");
            
            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        }
        catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
