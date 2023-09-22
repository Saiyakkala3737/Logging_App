package com.saicompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saicompany.dao.ReportDao;
import com.saicompany.service.MessageService;

@SpringBootApplication
public class LoggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAppApplication.class, args);

		MessageService service = new MessageService();

		service.getGreetmsg();
		service.getwelcomeMsg();

		ReportDao report = new ReportDao();
		report.getName(101);
	}

}
