package project;
import java.sql.*;
public class Connection_class {

	
static Connection con=null;
private Connection_class(){
	
}	
public static Connection getconnection() {
	try {
		
		if(con==null) {
			oracle.jdbc.driver.OracleDriver obj=new oracle.jdbc.driver.OracleDriver();
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","graphics","graphics");
			
		}
		
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return con;
	}
}


