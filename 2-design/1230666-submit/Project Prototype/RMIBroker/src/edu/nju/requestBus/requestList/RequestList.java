package edu.nju.requestBus.requestList;

import edu.nju.broker.model.Result;
import edu.nju.requestBus.model.Operation;

public interface RequestList {
	public boolean addNewRequest(Operation operation);
	
	//开始处理请求，把请求向后扩展
	//然后处理的请求得到一个reuslt，传回客户端
	public Result forwardRequest();
	
	
}
