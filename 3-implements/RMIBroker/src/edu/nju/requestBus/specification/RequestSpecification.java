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
		//智能分派的对照表
		//根据operation的类型来确定用哪个请求队列来处理
		operationMap=new HashMap();
		userList=UserBrokerRequestList.getInstance();
		scheduleList=ScheduleBrokerRequestList.getInstance();
		checker=RequestBusHeartBeatChecker.getInstance();
		
	}
	
	
	@Override
	public void specifyRequest(Operation operation) {
		// TODO Auto-generated method stub
		
		//这里就是根据不同的operation类型
		//来把他们分派到不同的后面的请求队列中
		
		if(operation.getType()==0){
			scheduleList.addNewRequest(operation);
		}else if(operation.getType() == 1){
			userList.addNewRequest(operation);
		}
		
		
		
	}

}
