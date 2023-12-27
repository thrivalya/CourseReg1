package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class Login {
	String email;
    String password;
    
    
    Scanner sc = new Scanner(System.in);
	public void logins() {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Email : ");
		email = sc.next();
		System.out.println("Enter Your Password : ");
		password = sc.next();
		String id = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection krishna = null;
		try {
			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query="select * from userregistrations";
		PreparedStatement view;
		try {
			int user=1;
			view = krishna.prepareStatement(query);
			ResultSet rs = view.executeQuery();
			while (rs.next()) {
				
				
            if(email.equals(rs.getString("email")) && password.equals(rs.getString("password"))) {
                user=2;
            	id=rs.getString("userid");   
            	System.out.println("login sucefully");
            	System.out.println("Welcome ");
    			Choice cho = new Choice();
    			email = cho.user_choice(email);
            	
    			break;
            }
            
			}
			if (user==1) {
				System.out.println("invalied email or password ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}