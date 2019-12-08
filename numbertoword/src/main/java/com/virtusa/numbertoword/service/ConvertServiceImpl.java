package com.virtusa.numbertoword.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.numbertoword.dao.ConvertDaoIface;
import com.virtusa.numbertoword.model.UserNumber;
/**
 * @author vijay
 *
 */
@Service
public class ConvertServiceImpl implements ConvertServiceIface {
	
	
	@Autowired
	ConvertDaoIface convertDaoIface;
	

	public String convertService(UserNumber userNumber) {
		
		return convertDaoIface.convertWord(userNumber);
	}

	
}
