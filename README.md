# DateTimeUtils

### Developed by
[Softpal](https://www.github.com/softpal)

[![](https://jitpack.io/v/softpal/DateTimeUtils.svg)](https://jitpack.io/#softpal/DateTimeUtils)


**Features**

Get Current Date and Time. <br>
Convert DateTime to Ago Time. <br>
Get Current Date & Time in Required format. <br>
Get Current Year. <br>
Convert time between 12 hours and 24 hours format. <br>
Get difference between two given dates with time.


## Installation

Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Add maven-gradle-plugin in project level gradle file

```javascript
    dependencies {
        classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'
}
```
    
    
### Gradle
[![](https://jitpack.io/v/softpal/DateTimeUtils.svg)](https://jitpack.io/#softpal/DateTimeUtils)
```javascript
dependencies {
    implementation 'com.github.softpal:DateTimeUtils:1.0'
}
```


## Usage

### 1. Get Ago Time

```javascript
        // Call the method by passing date in required format
       DateTimeUtils.getTimeAgo("19 Nov 2019 11:34:45:984");
```
Output : **5 hours ago**




### 2. Get Current Date

```javascript
       DateTimeUtils.getCurrentDate();
```
Output : **11-19-2019**




### 3. Get Current Date Time with Slashes

```javascript
       DateTimeUtils.getCurrentDateTimeWithSlashes();
```
Output : **2019/11/19 17:12:47**




### 4. Get Difference between Two Dates

```javascript
        //date format should be in MM/dd/yyyy HH:mm:ss
       String startDate = "01/01/2019 02:05:00";
       String endDate = "01/01/2020 05:06:56";
       String differenceTime = DateTimeUtils.diffBetweenDates(startDate,endDate);
```
Output : **365 days 3:1:56**