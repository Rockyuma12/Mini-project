package MiniProject;

public class Executer {
	
	private static final String Statements = null;

	public static void main(String[] args) {
		
		 // Inserting employees
        Statements.insertEmployees( 1, "John Doe", "Manager", 50000);
        Statements.insertEmployees( 2, "Mary", "Developer", 45000);

       
        // Updating designation and salary
       Statements.updateEmployees( 3,"Frontend developer", 60000);

 
		// Displaying employee details
        Statements.showDetails();
        
        Statements.insertEmployees(4,"bujji","supporter",650000);
        Statements.insertEmployees(5,"kutty","software developer",70000);
        

        //delete Employee
        Statements.deleteEmployees(5);
        
        Statements.showDetails();
        
        Statements.closeconnection();
	}
}
        
	
