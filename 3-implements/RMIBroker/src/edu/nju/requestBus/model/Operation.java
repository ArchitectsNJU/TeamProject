package edu.nju.requestBus.model;

import java.util.List;

public class Operation {
	
	
	
	public Operation() {
		super();
	}
	
	public Operation(List parameters, int type) {
		super();
		this.parameters = parameters;
		this.type = type;
	}
	
	
	
	
	List parameters;//从客户端的请求的参数存在这里
	int type;//区分请求的类型，用来处理智能分派
	
	
	
	
	
	public List getParameters() {
		return parameters;
	}

	public void setParameters(List parameters) {
		this.parameters = parameters;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
}
