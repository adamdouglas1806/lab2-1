package deadlines;
import java.util.ArrayList;

public class Date{
	
	int day;
	int month;
	int dayOfTheYear;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int Month) {
		this.month = Month;
	}
	
	public Date(int day, int month) {
		
		this.day = day;
		this.month = month;
		
		if((day < 1 || day > 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
			throw new IllegalArgumentException("invalid date - the day of the month should not be below 1 or above 31");
		}else if ((day < 1 || day > 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
			throw new IllegalArgumentException("invalid date - the day of the month should not be below 1 or above 30");
		}else if ((day < 1 || day > 28) && month == 2) {
			throw new IllegalArgumentException("invalid date - the day of the month should not be below 1 or above 28");
		}
			
	}
	
	public int getDayOfYear() {
		
	dayOfTheYear = 0; 
		
	ArrayList<Integer> dayOfYear = new ArrayList<Integer>();
	dayOfYear.add(31);
	dayOfYear.add(28);
	dayOfYear.add(31);
	dayOfYear.add(30);
	dayOfYear.add(31);
	dayOfYear.add(30);
	dayOfYear.add(31);
	dayOfYear.add(31);
	dayOfYear.add(30);
	dayOfYear.add(31);
	dayOfYear.add(30);
	dayOfYear.add(31);
	
	for (int i = 0; i < month-1; i++) {
		dayOfTheYear = dayOfYear.get(month) + dayOfTheYear;
	}
	
	dayOfTheYear = dayOfTheYear + day; 
	
	return dayOfTheYear;
	
	}
	
	public int daysUntil(Date d) {
		
		int initialDate = this.getDayOfYear();
		int difference = initialDate - d.getDayOfYear();
		return difference; 
		
	}
	
	public String ToString() {
		String date = day + "/" + month + "/2025";
		return date;
	}
	
}