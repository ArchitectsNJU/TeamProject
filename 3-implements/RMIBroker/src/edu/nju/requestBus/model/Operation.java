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
	
	
	
	
	List parameters;//�ӿͻ��˵�����Ĳ�����������
	int type;//������������ͣ������������ܷ���
	
	
	
	
	
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
