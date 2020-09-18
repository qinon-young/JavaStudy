package com.qinon.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDate {

	public static String nextDate(String dateString) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��m��d��");
		Date date;	
		try {
			date=sdf.parse(dateString);
		} catch (ParseException e) {
			return "�������������";
		}
		Calendar cal=Calendar.getInstance(); 
		cal.setTime(date);		
		cal.add(Calendar.DATE, 1); 				
		Date resultdate=cal.getTime(); 		
		return sdf.format(resultdate);
	}
	
}
