package model.entities;

/**
 * Class Date for format and validate all dates for class Account
 *
 * @author alissonfgc
 */

public class Date {
	private int day;
	private int month;
	private int year;
	private boolean valid = false;

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		Date.this.validateDate();
	}

	public void validateDate() {
		int lastDay = 31;

		if ((month > 0) && (month < 13) && (day > 0) && (day < 32) && (year > 0)) {
			if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
				lastDay = 30;
				this.valid = true;

			} else if (month == 2) {
				if (year % 4 == 0) {
					lastDay = 29;
				} else {
					lastDay = 28;
				}
			}

			if (day > lastDay) {
				Date.this.error();
			} else {
				valid = true;
			}
		}

	}

	public String error() {
		// this.valid = false;
		return "-Invalid date-";
	}

	public String formatedDatePTBR() {
		if (this.valid == true) {
			String date = String.format("%02d/%02d/%04d", this.day, this.month, this.year);
			return date;
		} else {
			return Date.this.error();
		}

	}

	public String formatedDateUS() {
		if (this.valid == true) {
			String date = String.format("%02d/%02d/%04d", this.month, this.day, this.year);
			return date;
		} else {
			return Date.this.error();
		}
	}
}