package MiniProject;
import java.sql.*;
public class DButil {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/SVHEC";
    private static final String USER = "cat";
    private static final String PASSWORD = "mahe678";
	
    public static Connection getConnectionObj() {
    	try {
    		
    		Class.forName("com.mysql.jdbc.Driver");
    	   return DriverManager.getConnection(URL,USER,PASSWORD);
    	}
    	catch (ClassNot FoundException e) {
    		System.out.println("Error "+ e.getMessage());
    		
    	}
    	catch (SQLException e) {
    		  System.out.println("Error "+e);
    		  
    		  
    	}
    	   
    	      return null;
    	      
    }
    
}