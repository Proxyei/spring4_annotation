package spring4_annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.spring4.configuration.AppConfiguration;
import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.service.UserService;

public class Test_Configuration {

	@Test
	public void testConfiguration() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		UserService userService = (UserService) context.getBean("userService");
		UserDao userDao = (UserDao) context.getBean("userDao");
		System.out.println(userService);
		System.out.println(userDao);
		String[] beans = context.getBeanDefinitionNames();
		System.out.println(beans);
		context.close();
	}

}
