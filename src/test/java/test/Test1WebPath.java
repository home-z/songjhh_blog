package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1WebPath {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("springmvc.xml");
		System.out.println(app.getBean("conversionService"));
	}
	
	public void test() {
		
	}
}
