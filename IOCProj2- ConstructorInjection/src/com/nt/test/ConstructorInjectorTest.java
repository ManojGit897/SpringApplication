package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenarator;

public class ConstructorInjectorTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("ConstructorInjectorTest.main()");
		Resource res = null;
		BeanFactory factory = null;

		String result = null;

		Object obj = null;

		WishMessageGenarator generator = null;
		// hold the name and location spring bean cfg file in resource object

		// res= new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		res = new ClassPathResource("com/nt/cfgs/applicationContext.xml");

		// create IOC container/Spring container(bean factory)

		/*
		 * factory=new XmlBeanFactory(res); // get Target Bean class obj from
		 * beanFactory container
		 * 
		 * obj=factory.getBean("wmg"); generator=(WishMessageGenarator)obj;
		 */
		
		generator=factory.getBean("wmg",WishMessageGenarator.class);
		// invoke the method
		result = generator.generateWishMessage("Mr Majnu u r in the Constructor injction  ");
		System.out.println("Message::" + result);

	}

}
