import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boo {
public static void main(final String[] args) throws Exception {
BeanFactory ctx = new ClassPathXmlApplicationContext("spring.xml");
FooService foo = (FooService) ctx.getBean("fooService");
foo.getFoo("Pengo", 12);
foo.getAfter();
foo.getBefore("Harshit");
}
}
