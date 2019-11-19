package com.softpal.datetimeutils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeUtils
{
	public static String getTimeAgo(String uploadDate)
	{
		String agoTime = "";
		try
		{
			SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS");
			Date past = format.parse(uploadDate);
			
			Date now = new Date();
			long seconds = TimeUnit.MILLISECONDS.toSeconds(now.getTime() - past.getTime());
			long minutes = TimeUnit.MILLISECONDS.toMinutes(now.getTime() - past.getTime());
			long hours = TimeUnit.MILLISECONDS.toHours(now.getTime() - past.getTime());
			long days = TimeUnit.MILLISECONDS.toDays(now.getTime() - past.getTime());
			if(seconds < 60)
			{
				System.out.println(seconds + " seconds ago");
				agoTime = seconds + " seconds ago";
			}
			else if(minutes < 60)
			{
				System.out.println(minutes + " minutes ago");
				agoTime = minutes + " minutes ago";
			}
			else if(hours < 24)
			{
				System.out.println(hours + " hours ago");
				agoTime = hours + " hours ago";
			}
			else
			{
				System.out.println(days + " days ago");
				agoTime = days + " days ago";
			}
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
		return agoTime;
	}
	
	public static String getCurrentDate()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		return df.format(c.getTime());
	}
	
	//This is the main - Approved Date Time Format
	public static String getCurrentDateTimeWithDashes()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(c.getTime());
	}
	
	public static String getCurrentDateTimeWithSlashes()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return df.format(c.getTime());
	}
	
	public static String getCurrentYear()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("yyyy");
		return df.format(c.getTime());
	}
	
	public static String formatDateTime(Date date)
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return df.format(date);
	}
	
	public static String formatDate(Date date)
	{
		SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS");
		return df.format(date);
	}
	
	public static String timeConversionTo24hours(String time12hours)
	{
		SimpleDateFormat displayFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		SimpleDateFormat parseFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		Date date = null;
		try
		{
			date = parseFormat.parse(time12hours);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return displayFormat.format(date);
	}
	
	public static String diffBetweenDates(String startDate,String endDate)
	{
		String dateStart = StringUtils.isEmpty(startDate) ? "01/01/2019 00:00:00" : startDate;
		String dateStop = StringUtils.isEmpty(endDate) ? "01/01/2019 00:00:00" : endDate;
		
		// HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date d1 = null;
		Date d2 = null;
		
		String diffTime = "";
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);
			
			// in milliseconds
			long diff = d2.getTime() - d1.getTime();
			
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);
			
			diffTime = diffDays+" days "+diffHours+":"+diffMinutes+":"+diffSeconds;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diffTime;
	}
	
	public static String getCurrentDateTimeWithSlashesInMMddyyyyHHmmss()
	{
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		return df.format(c.getTime());
	}
	
}
