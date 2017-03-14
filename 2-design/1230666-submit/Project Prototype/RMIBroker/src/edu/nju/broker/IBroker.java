package edu.nju.broker;

import edu.nju.broker.model.Request;
import edu.nju.broker.model.Result;

public interface IBroker {
	

	
	//请求总线的队列传来信息，然后broker处理
	//得到结果，以result的形式传回
	//实现的时候，注意request的里面应该含有用户是谁这样的信息
	//这样才可以把结果传回给所进行请求的用户
	public Result handleRequest(Request request);
	
	
	
	
	
	
	
}
