package spring4_annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.spring4.configuration.AppConfiguration;

public class Test_Configuration {

	@Test
	public void testConfiguration() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		String[] beans = context.getBeanDefinitionNames();

		for (String string : beans) {
			System.out.println(string);
		}

		context.close();
	}

}
