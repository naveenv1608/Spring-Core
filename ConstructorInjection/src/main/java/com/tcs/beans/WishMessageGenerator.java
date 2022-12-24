package com.tcs.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;

	/*public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}*/
	
	public WishMessageGenerator(Date date) {
		super();
		this.date = date;
	}

	public String generateMessage(String user) {
		int hours = date.getHours();

		if (hours < 12)
			return "Good Morning " + user;
		else if (hours < 16)
			return "Good Afternoon " + user;
		else if (hours < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}

	
}
