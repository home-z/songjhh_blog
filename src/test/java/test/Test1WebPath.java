package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1WebPath {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		System.out.println(app.getBean("conversionService"));
		System.out.println("dad");
	}
	
}
