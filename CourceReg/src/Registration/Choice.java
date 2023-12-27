package Registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Registration.Login;
public class Choice {
	public String user_choice(String email) {
	
		Connection krishna = null;
		
		
		try {
			krishna = DriverManager.getConnection("jdbc:mysql://localhost:3306/CourseRegistration","root","root");
			System.out.println("db connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loop=true;
		while(loop) {
			 System.out.println("Enter your choice \n1.display cources\n2.check report\n3.exit");
			 Scanner myObj = new Scanner(System.in);
			 int userinput = myObj.nextInt();
			switch(userinput) {
			case 1:
				System.out.println("Cources are \n enter\n 1.java\n2.python\n3.c programing\n4.data structure");
				int usercource = myObj.nextInt();
				
				switch(usercource) 
				{
				case 1:
					System.out.println("you chosed java");
					
					System.out.println("Java is a popular programming language.\n"
							
							+ "Java is used to develop mobile apps, web apps, desktop apps, games and much more.Java is one of the most popular and widely used programming language and platform. A platform is an environment that helps to develop and run programs written in any programming language.\r\n"
							+ "Java is fast, reliable and secure. From desktop to web applications, scientific supercomputers to gaming consoles, cell phones to the Internet, Java is used in every nook and corner.Java Environment: The programming environment of Java consists of three components mainly:\r\n"
							+ "JDK, "
							+ "JRE, "
							+ "JVM, ");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
					String id = null;
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q);
						
						ps.setBoolean(1,true);
						ps.setString(2,"java");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					
					
				case 2:
					
					System.out.println("you chosed python");

					
					System.out.println("Java is a popular programming language.\n"
							
							+ "Java is used to develop mobile apps, web apps, desktop apps, games and much more.Java is one of the most popular and widely used programming language and platform. A platform is an environment that helps to develop and run programs written in any programming language.\r\n"
							+ "Java is fast, reliable and secure. From desktop to web applications, scientific supercomputers to gaming consoles, cell phones to the Internet, Java is used in every nook and corner.Java Environment: The programming environment of Java consists of three components mainly:\r\n"
							+ "JDK, "
							+ "JRE, "
							+ "JVM, ");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_p = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_p);
						
						ps.setBoolean(1,true);
						ps.setString(2,"python");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("you chosed c programing");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_c = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_c);
						
						ps.setBoolean(1,true);
						ps.setString(2,"c program");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
					
				case 4:
					System.out.println("you chosed data structure");
					System.out.println("Your cource completed\n enter email-id");
					email=myObj.next();
					System.out.println("your certificate is mailed to your "+email);
				
					
					//selecting id
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String q_d = "UPDATE CourseRegistration SET statuss = ? WHERE course = ?";					//update
					try {
						PreparedStatement ps=krishna.prepareStatement(q_d);
						
						ps.setBoolean(1,true);
						ps.setString(2,"data structure");
						int row=ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					break;	
				}
				break;
			case 2:
				String selec="select course from CourseRegistration where email=? and statuss=1";
				try {
					PreparedStatement p=krishna.prepareStatement(selec);
					p.setString(1, email);
					ResultSet w=p.executeQuery();
					System.out.println("compleated cources");
					while(w.next()) {
						String course=w.getString("course");
						System.out.println(course);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String nselec="select course from CourseRegistration where email=? and statuss=0";
				try {
					PreparedStatement p=krishna.prepareStatement(nselec);
					p.setString(1, email);
					ResultSet w=p.executeQuery();
					System.out.println("not compleated cources");
					while(w.next()) {
						String course=w.getString("course");
						System.out.println(course);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				loop=false;
				break;
				
			}
			
			
		}
		return email;
		
	}

	
		// TODO Auto-generated method stub
	
}
