import java.text.SimpleDateFormat;
import java.util.*;

public class MyDate {
	private String day;
	private String month;
	private int year;

	public MyDate() {

	}

	public MyDate(String day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String print() {
		String fullDate = "";
		if (this.month.equals("01")) {
			fullDate += "January";
		} else if (this.month.equals("02")) {
			fullDate += "Febuary";
		} else if (this.month.equals("03")) {
			fullDate += "March";
		} else if (this.month.equals("04")) {
			fullDate += "April";
		} else if (this.month.equals("05")) {
			fullDate += "May";
		} else if (this.month.equals("06")) {
			fullDate += "June";
		} else if (this.month.equals("07")) {
			fullDate += "July";
		} else if (this.month.equals("08")) {
			fullDate += "August";
		} else if (this.month.equals("09")) {
			fullDate += "September";
		} else if (this.month.equals("10")) {
			fullDate += "October";
		} else if (this.month.equals("11")) {
			fullDate += "November";
		} else if (this.month.equals("02")) {
			fullDate += "December";
		}

		fullDate += " " + this.day;

		if (this.day.equals("01") || this.day.equals("11") || this.day.equals("21") || this.day.equals("31"))
			fullDate += "st";
		else if (this.day.equals("02") || this.day.equals("12") || this.day.equals("22"))
			fullDate += "nd";
		else if (this.day.equals("03") || this.day.equals("13") || this.day.equals("23"))
			fullDate += "rd";
		else
			fullDate += "th";

		fullDate += " " + this.year;

		return fullDate;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
