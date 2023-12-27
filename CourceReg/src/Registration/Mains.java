package Registration;
import Registration.User_Registration;
import Registration.Login;
import java.sql.SQLException;
import java.util.Scanner;

public class Mains {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("enter 1.Register\n2.login");
		Scanner myObj = new Scanner(System.in);
		int userlog = myObj.nextInt();
		switch(userlog) {
		case 1:
			User_Registration reg=new User_Registration();
			reg.regd();
			
		case 2:
			Login log=new Login();
			log.logins();
			
			
			
			
		}
		
	}
	

}
