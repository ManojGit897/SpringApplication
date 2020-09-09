package com.nt.test;

import java.util.Scanner;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVo;

public class RealtimeDITest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name=null,cadd=null,pamt=null,rate=null,time=null;
		CustomerVo vo=null;
		ApplicationContext ctx=null;
		MainController controller=null;
		String result=null;
		
		System.out.println(" Enter customer name ::");
		name=sc.next();
		System.out.println("enter customer Addres");
		cadd=sc.next();
		System.out.println("enter the principle amount");
		pamt=sc.next();
		System.out.println("Enter the rate of intrest ::");
		rate=sc.next();
		System.out.println("Enter the time ::");
		time=sc.next();
		// store inputs into vo class object
		vo=new CustomerVo();
		
		/*vo.setCname(name);
		vo.setCadd(cadd);
        vo.setpAmt(pamt);
        vo.setRate(rate);
        vo.setTime(time);*/


        vo.setCname(name);
		vo.setCadd(cadd);
        vo.setpAmt(pamt);
        vo.setRate(rate);
        vo.setTime(time);
        
        ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       
        // get controller bean class object
        
        controller =ctx.getBean("controller", MainController.class);
        // invoking the method 
        try {
        	result =controller.processCustomer(vo);
        	System.out.println(result);
        	
        }
        catch(Exception e) {
        	System.out.println("internal problem");
        	e.printStackTrace();
        }
	
	}

	

}
