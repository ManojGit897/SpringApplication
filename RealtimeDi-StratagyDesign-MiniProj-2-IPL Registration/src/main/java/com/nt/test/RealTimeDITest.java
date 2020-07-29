package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.PlayerVo;

public class RealTimeDITest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String pname,page,t20btavg,odibtavg,testbtavg,t20blwavg,odiblwavg,testblwavg;
		
		String result =null;
		PlayerVo vo=new PlayerVo();
		
		DefaultListableBeanFactory factory;
		XmlBeanDefinitionReader reader;
		
		MainController controller;
		
		System.out.println("Enter the Player name : ");
		pname=sc.next();
		System.out.println("Enter the Player Age : ");
		page=sc.next();
		System.out.println(" Enter the t20 batting avg :  ");
		t20btavg=sc.next();
		System.out.println("Enter the old batting avg :");
		odibtavg=sc.next();
		System.out.println("Enter the test batting avg :");
		testbtavg=sc.next();
		
		System.out.println(" Enter the t20 bowling avg :  ");
		t20blwavg=sc.next();
		System.out.println("Enter the old bowling avg :");
		odiblwavg=sc.next();
		System.out.println("Enter the test bowling avg :");
		testblwavg=sc.next();
		
		// store inputs into vo class objects 
	vo.setPname(pname);
	vo.setPage(page);
		vo.setT20btavg(t20btavg);
		vo.setT20blwavg(t20blwavg);
		vo.setOdibtavg(odibtavg);
		vo.setOdiblwavg(odiblwavg);
		vo.setTestbtavg(testbtavg);
		vo.setTestblwage(testblwavg);
		//create bean factory container
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		// get the controller class object 
		
		controller=factory.getBean("controller", MainController.class);
		
		// invoking the method 
		
		 try {
	        	result =controller.processPlayer(vo);
	        	System.out.println(result);
	        	
	        }
	        catch(Exception e) {
	        	System.out.println("internal problem");
	        	e.printStackTrace();
	        }
		
		
		

	}

}
