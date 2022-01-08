package com.te.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Demo implements InitializingBean,DisposableBean{

	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("the bean is initiated");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying the bean");
	}
public void name() {
	System.out.println("After setting properties...");
}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from set properties");
	}

}