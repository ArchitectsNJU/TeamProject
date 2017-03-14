package edu.nju.broker;

import java.util.List;
import java.util.Map;

import edu.nju.broker.model.Result;

public class InfoBridge {
	
	
	
	public InfoBridge(List brokerList) {
		super();
		this.brokerList = brokerList;
	}
	
	
	//有一个map，一个请求对于一个broker
	Map map;
	
	//有一个所有broker的list
	List brokerList;
	
	
	
	
	
	public Result send(IBroker destination, Object info){
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
