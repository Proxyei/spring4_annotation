package spring4_annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.xywei.spring4.value.Config_Value;
import com.xywei.spring4.value.Person;

/**
 * 测试使用value
 * 
 * @author wodoo
 *
 */
public class TestValue {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				Config_Value.class);

		Person person = annotationConfigApplicationContext.getBean(Person.class);

		System.out.println("person>>>>>>:" + person);

		ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
		System.out.println("address>>>>>>:" + environment.getProperty("person.address"));

		annotationConfigApplicationContext.close();
	}

}
