package Corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datedemo {
	
	public Datedemo() {
		System.out.println("Default Constructor");
	}
	
	public Datedemo(int i,int j) {
		int c = i+j;
		System.out.println("Sum of costructor passed value is "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datedemo cj = new Datedemo();
		Datedemo cp = new Datedemo(3,5);
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
		SimpleDateFormat sd = new SimpleDateFormat("mm:ss:hh");
		System.out.println(sd.format(dt));
		System.out.println(sdf.format(dt));
		System.out.println(dt.toString());
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.TUESDAY));
		System.out.println(cal.get(Calendar.APRIL));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		
		System.out.println("Hi this is for git");
		System.out.println("Hi this is for hit");
		System.out.println("Hi this is for bit");
		System.out.println("Hi this is for kit");
		
		System.out.println("HI this is asian guy");
		System.out.println("Hello");
	}

}
