package edu.nju.service;


import java.util.ArrayList;
import java.util.List;

import edu.nju.requestBus.model.Operation;
import edu.nju.requestBus.specification.RequestSpecification;
import edu.nju.requestBus.specification.RequestSpecificationService;

public class GetScheduleServiceImpl implements GetScheduleService{

	@Override
	public List getSchedules(String username) {
		// TODO Auto-generated method stub
		
		Operation operation = new Operation();
		List list=new ArrayList();
		list.add(username);
		operation.setParameters(list);
		operation.setType(0);
		
		
		RequestSpecificationService specification=new RequestSpecification();
		specification.specifyRequest(operation);
		
		
		
		return null;
		
	}

}
