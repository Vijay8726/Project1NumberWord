
package com.virtusa.numbertoword.dao;

import org.springframework.stereotype.Repository;

import com.virtusa.numbertoword.model.UserNumber;

/**
 * @author vijay
 *
 */
@Repository
public class ConvertDaoImpl implements ConvertDaoIface {

	/**
	 * @param number
	 * @return
	 */
	static String convert(int number) {
		String word1[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"
				,"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String word2[]=  {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		if(number<0)
		{
			return "Please enter positive number";
		}
		else if(number==0)
		{
			return "zero";
		}
		else if(number<20)
		{
				return word1[number];
			
		}
		else if(number>=20 && number<100)
		{
			
		  	return  word2[number/10] +" "+ word1[number%10];
		}
		else if(number>=100 && number<1000)
		{
			return convert(number/100)+" "+ "hundred" +" "+ "and "+ convert(number%100) ;
		}
		else if(number>=1000 && number<100000)
		{
			return convert(number/1000)+" "+"thousand"+" " +convert(number%1000);
		}
		else if(number>=100000 && number<1000000)
		{
			return convert(number/100000)+" "+"hundred"+" "+ "and"+" "+convert(number%100000);
		}
		else
		{
			return convert(number/1000000)+" "+"million"+" "+convert(number%1000000);
		}
		}

	/**
	 *
	 */
	public String convertWord(UserNumber userNumber) {
		if(userNumber.getNumber().length()>9) {
			return "Please Enter a number between 0 to 999999999";
		}
		else {
			return convert(Integer.parseInt(userNumber.getNumber()));
		}
	}

}
