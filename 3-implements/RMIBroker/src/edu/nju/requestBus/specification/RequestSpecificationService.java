package edu.nju.requestBus.specification;

import edu.nju.requestBus.model.Operation;

public interface RequestSpecificationService {
	
	//对于得到的请求，进行识别
	public void specifyRequest(Operation operation);
	
	
}
