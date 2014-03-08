import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource res = null;
		XmlBeanFactory xmlfactory = null;		
		res = new org.springframework.core.io.FileSystemResource("mybeans.xml");
		xmlfactory = new XmlBeanFactory(res);
		TopDao dao = (TopDao) xmlfactory.getBean("empHbnDao");
		System.out.println("Got dao : "+dao);
		Employee emp = new Employee();
		//emp.setId(1);
		emp.setEmpid(12453);
		emp.setName("Dr Rajni");
		dao.create(emp);
		System.out.println("Employee created");
	}

}
