package com.softpal.datetimeutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.softpal.datetimeutils.DateTimeUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
	public static String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// For getting Time Ago
		String timeAgo = DateTimeUtils.getTimeAgo("19 Nov 2019 11:34:45:984");
		Log.v(TAG,"timeAgo=="+timeAgo);
		
		String currentDate = DateTimeUtils.getCurrentDate();
		Log.v(TAG,"currentDate=="+currentDate);
		
		String currentDateWithDashes = DateTimeUtils.getCurrentDateTimeWithDashes();
		Log.v(TAG,"currentDateWithDashes=="+currentDateWithDashes);
		
		String currentTimeWithSlashes = DateTimeUtils.getCurrentDateTimeWithSlashes();
		Log.v(TAG,"currentTimeWithSlashes=="+currentTimeWithSlashes);
		
		String currentYear = DateTimeUtils.getCurrentYear();
		Log.v(TAG,"currentYear=="+currentYear);
		
		String time12hours = "12/05/2019 02:25:01 PM";
		String time24hours = DateTimeUtils.timeConversionTo24hours(time12hours);
		Log.v(TAG,"time24hours=="+time24hours);
		
		String startDate = "01/01/2019 02:05:00";
		String endDate = "01/01/2020 05:06:56";
		String differenceTime = DateTimeUtils.diffBetweenDates(startDate,endDate);
		Log.v(TAG,"differenceTime=="+differenceTime);
	}
}
