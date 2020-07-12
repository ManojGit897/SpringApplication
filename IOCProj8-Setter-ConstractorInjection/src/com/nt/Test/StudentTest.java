package com.nt.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.components.Student;

public class StudentTest {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student stud=null;
		BeanFactory factory=null;
		
		// create IOC container
		//factory= new XmlBeanFactory(new ClassPathResource("com.nt.cfgs/applicationContext.xml"));
     factory= new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		// get Spring bean class object
		
		stud=factory.getBean("stud",Student.class);
		System.out.println(stud);
		
	}
   
	

}
