package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inseration {
	public void insert(String email){
		//connection
				Connection krishna = null;
				try {
					krishna = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","root");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				//inseration
				
				String queary="insert into CourseRegistration(email,course,statuss) values (?,?,?)";
				
				try {
					PreparedStatement ps=krishna.prepareStatement(queary);
					ps.setString(1,email);
					ps.setString(2, "java");
					ps.setBoolean(3,false);
					int row=ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				String queary1="insert into CourseRegistration(email,course,statuss) values (?,?,?)";
				
				try {
					PreparedStatement ps=krishna.prepareStatement(queary1);
					ps.setString(1,email);
					ps.setString(2, "python");
					ps.setBoolean(3,false);
					int row=ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
String queary2="insert into CourseRegistration(email,course,statuss) values (?,?,?)";
				
				try {
					PreparedStatement ps=krishna.prepareStatement(queary2);
					ps.setString(1,email);
					ps.setString(2, "c program");
					ps.setBoolean(3,false);
					int row=ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
String queary3="insert into CourseRegistration(email,course,statuss) values (?,?,?)";
				
				try {
					PreparedStatement ps=krishna.prepareStatement(queary3);
					ps.setString(1,email);
					ps.setString(2, "data structure");
					ps.setBoolean(3,false);
					int row=ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("connected to inseration");
	}

}
