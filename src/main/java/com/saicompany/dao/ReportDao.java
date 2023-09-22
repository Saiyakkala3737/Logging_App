package com.saicompany.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportDao {

	private static final Logger Logger=LoggerFactory.getLogger(ReportDao.class);
	public String getName(Integer id) {
		String name = null;
		Logger.info("getname() - method start");
		if(id == 101) {
			name= "John";
		}else if(id == 102) {
			name= "smith";
		}else {
			name= "Invalid Id";
		}
		Logger.info("getname() - method start");
		return name;
	}
}
