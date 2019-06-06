package spring4_annotation;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.xywei.spring4.configuration.AppConfiguration;
import com.xywei.spring4.service.UserService;
import com.xywei.spring4.service.impl.UserServiceImpl;

public class Test_Configuration {

	@Test
	public void testConfiguration() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		String[] beans = context.getBeanDefinitionNames();

		for (String string : beans) {
			System.out.println(string);
		}

		UserService userService = (UserService) context.getBean("userService001");
//		UserService userService = (UserService) context.getBean(UserServiceImpl.class);
		System.out.println("userService>>>>>>>>>>>>>>>>"+userService);
		ConfigurableEnvironment environment = context.getEnvironment();
		Map<String, Object> systemProperties = environment.getSystemProperties();
		System.out.println(systemProperties);
		String[] activeProfiles = environment.getActiveProfiles();
		for (String string : activeProfiles) {
			System.out.println(string);
		}
		context.close();
	}

}
