package edu.nju.vo;

public class Schedule {
	private String railName;
	private String beginDate;
	private String endDate;
	public Schedule(String railName, String beginDate, String endDate) {
		super();
		this.railName = railName;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	public Schedule() {
		super();
	}
	public String getRailName() {
		return railName;
	}
	public void setRailName(String railName) {
		this.railName = railName;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
