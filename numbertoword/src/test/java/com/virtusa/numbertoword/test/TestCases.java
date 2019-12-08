package com.virtusa.numbertoword.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.virtusa.numbertoword.dao.ConvertDaoIface;
import com.virtusa.numbertoword.dao.ConvertDaoImpl;
import com.virtusa.numbertoword.model.UserNumber;

/**
 * @author vijay
 *
 */
public class TestCases {
	@Test
	public void numberGreaterThan9() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("1234560987655");
		assertEquals("Please Enter a number between 0 to 999999999",iface.convertWord(userNumber));
	}
	@Test
	public void numberNegative() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("-12345");
		assertEquals("Please enter positive number",iface.convertWord(userNumber));
	}
	@Test
	public void numberOne() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("1");
		assertEquals("one",iface.convertWord(userNumber));
	}
	@Test
	public void numberTen() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("10");
		assertEquals("ten",iface.convertWord(userNumber));
	}
	@Test
	public void number21() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("21");
		assertEquals("twenty one",iface.convertWord(userNumber));
	}
	@Test
	public void number105() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("105");
		assertEquals("one hundred and five",iface.convertWord(userNumber));
	}
	@Test
	public void number56945781() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("56945781");
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",iface.convertWord(userNumber));
	}
	@Test
	public void number0() {
		UserNumber userNumber=new UserNumber();
		ConvertDaoIface iface=new ConvertDaoImpl();
		userNumber.setNumber("0");
		assertEquals("zero",iface.convertWord(userNumber));
	}
	
	
}
