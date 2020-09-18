package com.qinon.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDate {

	public static String nextDate(String dateString) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年m月d日");
		Date date;	
		try {
			date=sdf.parse(dateString);
		} catch (ParseException e) {
			return "输入的日期有误！";
		}
		Calendar cal=Calendar.getInstance(); 
		cal.setTime(date);		
		cal.add(Calendar.DATE, 1); 				
		Date resultdate=cal.getTime(); 		
		return sdf.format(resultdate);
	}
	
}
