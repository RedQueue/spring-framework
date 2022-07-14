import com.yys.UserBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: ys
 * @Date: 2022/7/14 16:10
 */
public class MyTest {
	@Test
	public void test1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		UserBean userBean = (UserBean)applicationContext.getBean("userBean");
		System.out.println(userBean.toString());
	}
}
