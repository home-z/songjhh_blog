package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1WebPath {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring/springmvc.xml");
		System.out.println(app.getBean("conversionService"));
		System.out.println("dad");
	}
	
	@Test
	public void test1() {
		System.out.println("sdfjal");
	}
	
}
