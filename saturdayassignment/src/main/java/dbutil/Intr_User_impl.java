package dbutil;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.bean.Mail;
import com.masai.bean.User;

public class Intr_User_impl implements Intr_User {

	public List<User> alluser() {
		// TODO Auto-generated method stub
		return null;
	}

	public String adduser(User usr, Mail mm) {

		String st = "user not added";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
	
//		mm.setUser(usr);
//		usr.setMl(mm);

		em.persist(usr);
		
		st = "User added sucess";
		em.getTransaction().commit();
		em.close();
		
		
		return st;

	}

	public User getuserdetails(int user_id) {
		
		User ur = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		ur = em.find(User.class, user_id);
		
		return ur;
		
	}

	public String deleteuser(int user_id) {
		
		String ur = "user not deleted";
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		User u = em.find(User.class, user_id);
		
		em.remove(u);
		ur = "user got deleted";
		em.getTransaction().commit();
		em.close();
		
		return ur;
		
	}

	public User getuserwithMail(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createemail(Mail ml) {
		
		String st = "mail not added";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("stdUnit");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(ml);
		
		st = "mail added sucess";
		em.getTransaction().commit();
		em.close();
		
		
		return st;
		
	}

	public String adduser(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

}
