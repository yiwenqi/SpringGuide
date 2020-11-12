package cn.gsdx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.gsdx.domain.Student;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac =new ClassPathXmlApplicationContext("beans.xml");
		Student stu = (Student)ac.getBean("stu");
		stu.show();
	}

}
