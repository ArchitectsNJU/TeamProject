package edu.nju.requestBus.requestList;

import edu.nju.broker.model.Result;
import edu.nju.requestBus.model.Operation;

public interface RequestList {
	public boolean addNewRequest(Operation operation);
	
	//��ʼ�������󣬰����������չ
	//Ȼ���������õ�һ��reuslt�����ؿͻ���
	public Result forwardRequest();
	
	
}
