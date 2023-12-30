package MiniProject;
import java.sql.*;

public class Statements {
       static Connection connect;
       static PreparedStatement PrepStat;
       static Statement Stat;
       
       static {
    	   connect = DButil.getConnectionObj();
    	   
    	   
    	   if(connect ! = null) {
    		   System.out.println("connection successfull");
    		   
    	   }
    	   
       }
       public static void showDetails() {
    	   try {
    		   Stat =connect.createStatement();
    		   ResultSet rs = Stat.executeQuery("SELECT* FROM Employees");
    		   
    		   while(rs.next()) {
    			   System.out.println(rs.getInt(1) +" " + rs.getString(2) +" "+rs.getString(3) +" "+rs.getInt(4));
    			   
    		       }
    		   
    	   }
    	   catch(SQLException e) {
    		   System.out.println("Error..."+ e.getMessage());   
    	       }
    	   
    	   
       }
       public static void insertEmployees(int empId, String empName, String Designation, double Salary) {
    	   try {
    		   
    		   PrepStat = connect.prepareStatement("INSERT INTO employees (EmpId, EmpName, Designation,Salary)VALUES ( ? ? ? ?)");
    		   
    		   PrepStat.setInt(1,  empId);
    		   PrepStat.setString(2,  empName);
    		   PrepStat.setString(3,  Designation);
    		   PrepStat.setDouble(1,  Salary);
    		   
    		  
               int rowsAffected = PrepStat.executeUpdate();
               if (rowsAffected > 0) {
                   System.out.println("Employee inserted successfully.");
               } else {
                   System.out.println("Failed to insert employee.");
               }
           } catch (SQLException e) {
               System.out.println("Error...."+ e.getMessage());
           }
       }
       
       public static void updateEmployee(int EmpID, String Designation, double Salary) {
	        try {
	           
	            PrepStat = connect.prepareStatement("UPDATE employee SET Designation ="+ Designation +", Salary ="+ Salary +" WHERE EmpID ="+EmpID); 

	            
	            
	            int rowsAffected = PrepStat.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Employee updated successfully.");
	            } 
	            else {
	                System.out.println("Employee with EmpId " + EmpID + " not found.");
	            } 
	            catch (SQLException e) {
	                System.out.println("Error...."+ e.getMessage());
	            }
	        }
	        
	        
	        public static void deleteEmployees(int EmpID, String Designation, double Salary) {
		     
	        try {
	        	PrepStat=connect.prepareStatement("DELETE FROM employee WHERE EmpID = ?"); 
	        

	            PrepStat.setInt(1, empId);

	            int rowsAffected = PrepStat.executeUpdate();
	            if (rowsAffected > 0) {
	                System.out.println("Employee deleted successfully.");
	            } else {
	                System.out.println("Employee with EmpId " + empId + " not found.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error..."+ e.getMessage());
	        }
	    }
	 
	 public static void closeconnection() {
		 try {
			 if(connect != null) {
			 PrepStat.close();
			 connect.close();
			 System.out.println("Connection terminated");
		 }
		 }
		 catch(SQLException e) {
			 System.out.println(e.getMessage());
		 }
	 }
}
	        

    		   
    		   
    		   
    		   
    	   
 
    		   
    	