package edu.nju.po.schedule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Schedule implements Serializable {

	List<Route> list;

	public Schedule() {
		list = new ArrayList<Route>();
	}
	
	public List<Route> getList() {
		return list;
	}

	public void setList(List<Route> list) {
		this.list = list;
	}
	
	public void add(Route route){
		list.add(route);
	}
}
