package cn.gsdx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.gsdx.domain.User;

public class Test {
	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User)ac.getBean("user");
		user.show();
	}
}
