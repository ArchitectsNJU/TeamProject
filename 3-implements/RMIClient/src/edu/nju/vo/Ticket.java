package edu.nju.vo;

public class Ticket {
	
	
	
	
	
	
	public Ticket() {
		super();
	}
	
	public Ticket(String date, String name, String railName) {
		super();
		this.date = date;
		this.name = name;
		this.railName = railName;
	}
	
	private String date;
	private String name;
	private String  railName;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRailName() {
		return railName;
	}
	public void setRailName(String railName) {
		this.railName = railName;
	}
	
	
	
}
