package Registration;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class User_Registration {

	
	public  void regd() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","root");
		System.out.println("----connection created----");
		System.out.println("User Registration");
		System.out.println("For user registration enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your password");
		String pwd=sc.next();
		String reginsert="insert into userregistrations (name,email,password) values(?,?,?);";
		PreparedStatement ps1 = con.prepareStatement(reginsert);
	    ps1.setString(1, name);
		ps1.setString(2,email );
		ps1.setString(3,pwd);
		int rows1=0;
	    rows1=ps1.executeUpdate();
		if(rows1>0)
			System.out.println("Your Registration is successfull");
		Inseration i=new Inseration();
		i.insert(email);
		
		
			}
}
