package com.springinaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class ExecutorBean {

	private static String filePath = "WebContent/WEB-INF/spring-common.xml";
	
	public static void main (String [] args ) throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext( filePath );
		if ( ctx == null ) {
			System.out.println(" can not get context ");
			return ;
		}
		
		ExecutorBean.display(ctx, "duke", "basic");
		ExecutorBean.display(ctx, "poeticDuke", "construtor Injection");
		ExecutorBean.display(ctx, "kenny", "Basic Bean injecation");
		ExecutorBean.display(ctx, "kenny2", "Inner Bean injection");
		
		
		
		ctx = null;
	}
	
	public static void display(ApplicationContext ctx, String beanName , String title) {
		System.out.println("-------------------------------------------");
		System.out.println(title);
		System.out.println("-------------------------------------------");
		Performer performer = (Performer)ctx.getBean(beanName);
		performer.perform();
		System.out.println();
	}
}
