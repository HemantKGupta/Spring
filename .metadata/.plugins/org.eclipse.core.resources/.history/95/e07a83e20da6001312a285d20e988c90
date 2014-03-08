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
		TopDao dao = (TopDao) xmlfactory.getBean("empDao");
		System.out.println("Got dao : "+dao);
		Employee emp = new Employee();
		emp.setEmpid(12234);
		emp.setName("Hemant");
		dao.create(emp);
		System.out.println("Employee created");
	}

}
