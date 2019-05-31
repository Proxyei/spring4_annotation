package spring4_annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.spring4.condition.ConditionConfig;
import com.xywei.spring4.domain.User;

public class TestCondition {

	@Test
	public void test1() {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConditionConfig.class);
		User user = annotationConfigApplicationContext.getBean(User.class);
		System.out.println("user>>>>>>>:" + user);
		String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);

		}
		annotationConfigApplicationContext.close();
	}

}
