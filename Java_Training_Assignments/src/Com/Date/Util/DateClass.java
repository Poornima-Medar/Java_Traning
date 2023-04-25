package Com.Date.Util;

public class DateClass {
	private int year;
	private int month;
	private int day;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
		this.month = getMonth();
		this.year = getYear();

		if (day < 1) {
			this.day = 1;
		} else if (day > 31) {
			if (this.month == 2) {
				if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
					this.day = 29;
				} else {
					this.day = 28;
				}
			} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
				this.day = 30;
			} else {
				this.day = 31;
			}
		}
	}
	
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
		if (month > 12) {
			this.month = 12;
		} else if (month < 1) {
			this.month = 1;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
		if (year > 2030) {
			this.year = 2030;
		} else if (year < 2023) {
			this.year = 2023;

		}
	}

	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year + "";
	}

}
