package week11.math_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println(getFebruary(2018));
		String data1="2012年10月10日";
		String data2="2013年2月2日";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.print(data1+"和"+data2);
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		c1.setTime(sdf.parse(data1));
		c2.setTime(sdf.parse(data2));
		System.out.println("相差"+getInterval(c2,c1)+"天");
//		System.out.println(getInterval(c1, c2));
//		System.out.println(getIntervalDay(c1, c2));
	}

	static int getFebruary (int year) {
		int daycount=0;
		Calendar calendar=Calendar.getInstance();
		calendar.set(year,2,1);
//		calendar.set(Calendar.MONTH, 3);
		calendar.add(Calendar.DATE, -1);
		daycount=calendar.get(Calendar.DAY_OF_MONTH);
		return daycount;
	}
	static int getInterval(Calendar floor,Calendar upper) {
		int interval=0;
		long temp=floor.getTimeInMillis()-upper.getTimeInMillis();
		interval=(int)(temp/1000/60/60/24);
		return interval;
	}
	static int getIntervalDay(Calendar floor,Calendar upper) {
		int interval=0;
		long temp=Math.abs(floor.getTimeInMillis()-upper.getTimeInMillis());
		interval=(int)(temp/1000/60/60/24);
		return interval;
	}
}
