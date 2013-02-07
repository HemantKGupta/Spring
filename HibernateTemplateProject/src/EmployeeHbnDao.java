

import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class EmployeeHbnDao implements TopDao {
	
	private SessionFactory sessionFactory=null;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public int create(Object obj) {
		
		HibernateTemplate ht = new HibernateTemplate(sessionFactory	);
		ht.save(obj);
		return 1;

		
	}

}
