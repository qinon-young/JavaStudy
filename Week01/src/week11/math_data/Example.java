package week11.math_data;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Example {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
//		long starttime=System.currentTimeMillis();
//		int sum=0;
//		for (int i = 0; i < 100000000; i++) {
//			sum+=i;
//		}
//		System.out.println(System.currentTimeMillis()-starttime+"ºÁÃë");
//		
//		System.out.println(Math.E);
//		System.out.println(Math.PI);
//		System.out.println(Math.ceil(3.5));
//		System.out.println(Math.floor(3.5));
//		System.out.println(Math.round(3.5));
//		System.out.println(Math.random());
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*6));
//		}
//		Random random=new Random();
//		System.out.println(random.nextInt());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(random.nextInt(6));
//		}
		String str="223";
		int num=11;
		str=String.valueOf(num);
		Integer integer=Integer.valueOf(num);
		integer=Integer.valueOf(str);
		System.out.println(integer.toString());
		num=Integer.parseInt("2232");
		System.out.println(num);
	
		//Calendar calendar=Calendar.getInstance();
		//System.out.println(calendar.get(Calendar.YEAR));
		//calendar.add(Calendar.YEAR, 1);
//		System.out.println(calendar.get(Calendar.YEAR));	
//		System.out.println(calendar.get(Calendar.MONTH));
//		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println(calendar.get(Calendar.DATE));	
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//		System.out.println(calendar.get(Calendar.HOUR));	
//		System.out.println(calendar.get(Calendar.MINUTE));
//		System.out.println(calendar.get(Calendar.SECOND));		
//		Date date=new Date();
//		System.out.println(date);
		Calendar c1=Calendar.getInstance();
		c1.set(2012, 12, 12);
		c1.add(Calendar.DATE, 100);
		System.out.println(c1.getTime());
		Date d1=new Date();
		c1.setTime(d1);
		System.out.println(c1.get(Calendar.YEAR));
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf1.format(c1.getTime()));
		String src1="2017.1.2";
		c1.setTime(sdf1.parse(src1));
		System.out.println(c1.get(Calendar.YEAR));
		
		DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df3=DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df4=DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println("-------------");
		System.out.println(df1.format(d1));
		System.out.println(df2.format(d1));
		System.out.println(df3.format(d1));
		System.out.println(df4.format(d1));
		
		DateFormat dft1=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		DateFormat dft2=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL);
		DateFormat dft3=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT);
		DateFormat dft4=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		System.out.println(dft1.format(d1));
		System.out.println(dft2.format(d1));
		System.out.println(dft3.format(d1));
		System.out.println(dft4.format(d1));
		
		System.out.println(df2.parse("2019Äê5ÔÂ6ÈÕ"));
		System.out.println(df4.parse("2019-5-6"));
	}

}
