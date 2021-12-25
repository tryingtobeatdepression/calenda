package user;

import date.Date;

import java.util.List;

public class User {
	private String name;
	private Role role;
	private List<Date> dates;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(String name, Role role) {
		this.name = name;
		this.role = role;
	}

	public void displayDates(String time) {
		System.out.println("User: " + name + ". Dates: ");
		for(Date date: dates) {
			date.displayDateInfo();
		}
	}
}