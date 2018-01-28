package com.opencodez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MailDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MailDemoApplication.class, args);

		ApplicationContext ctx = SpringApplication.run(MailDemoApplication.class, args);

		AppMailSender bean = ctx.getBean(AppMailSender.class);
		try {
			bean.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main Terminado.");
	}
}
