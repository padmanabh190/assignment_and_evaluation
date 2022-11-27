package dbutil;

import java.util.List;

import com.masai.bean.Mail;
import com.masai.bean.User;

public interface Intr_User {

	public List<User> alluser();
	
	public String adduser(User usr);
	
	public User getuserdetails(int user_id);
	
	public String deleteuser(int user_id);
	
	public User getuserwithMail(int user_id);
	
	public String createemail(Mail ml);
	
}
