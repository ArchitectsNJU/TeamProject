package edu.nju.requestBus.specification;

import java.util.HashMap;
import java.util.Map;

import edu.nju.requestBus.heartBeat.RequestBusHeartBeatChecker;
import edu.nju.requestBus.model.Operation;
import edu.nju.requestBus.requestList.ScheduleBrokerRequestList;
import edu.nju.requestBus.requestList.UserBrokerRequestList;

public class RequestSpecification implements RequestSpecificationService{

	
	Map operationMap;
	UserBrokerRequestList userList;
	ScheduleBrokerRequestList scheduleList;
	RequestBusHeartBeatChecker checker;
	
	
	public RequestSpecification(){
		//���ܷ��ɵĶ��ձ�
		//����operation��������ȷ�����ĸ��������������
		operationMap=new HashMap();
		userList=UserBrokerRequestList.getInstance();
		scheduleList=ScheduleBrokerRequestList.getInstance();
		checker=RequestBusHeartBeatChecker.getInstance();
		
	}
	
	
	@Override
	public void specifyRequest(Operation operation) {
		// TODO Auto-generated method stub
		
		//������Ǹ��ݲ�ͬ��operation����
		//�������Ƿ��ɵ���ͬ�ĺ�������������
		
		if(operation.getType()==0){
			scheduleList.addNewRequest(operation);
		}else if(operation.getType() == 1){
			userList.addNewRequest(operation);
		}
		
		
		
	}

}
