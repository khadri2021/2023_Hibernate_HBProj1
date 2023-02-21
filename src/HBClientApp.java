import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HBClientApp {

	public static void main(String[] args) {

		// configuration

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();

		// Session
		Session session = factory.openSession();

		// Trx
		Transaction txn = session.beginTransaction();

		Student student = new Student();
//		student.setStdId(100);
		student.setStdName("ALLEN");

		session.save(student);

		txn.commit();
		
		
		// close resources
		session.close();
		factory.close();

	}
}
