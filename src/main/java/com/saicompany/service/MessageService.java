package com.saicompany.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService {

	private static final Logger logger= LoggerFactory.getLogger(MessageService.class);	

	public String getwelcomeMsg() {

		logger.debug("getwelcomeMsg() - method start");

		String msg = "Welcome To Ashok IT...!";

		logger.debug("getwelcomeMsg() - method end");

		return msg;
	}

	public String getGreetmsg() {

		logger.debug("getGreetmsg() - method start");

		String msg= "Good morning...!!";

		logger.debug("getGreetmsg() - method end");

		return msg;
	}

}
