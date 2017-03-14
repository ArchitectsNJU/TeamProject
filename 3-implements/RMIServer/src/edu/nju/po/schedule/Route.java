package edu.nju.po.schedule;

import java.io.Serializable;

public class Route implements Serializable {
	
	String trainID;
	String start;
	String end;
	
	public Route(String trainID, String start, String end) {
		super();
		this.trainID = trainID;
		this.start = start;
		this.end = end;
	}
	
	public Route() {
		super();
	}

	public String getTrainID() {
		return trainID;
	}

	public void setTrainID(String trainID) {
		this.trainID = trainID;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
	
	
}
