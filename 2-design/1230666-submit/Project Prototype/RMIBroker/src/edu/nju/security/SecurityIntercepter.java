package edu.nju.security;

import edu.nju.broker.model.Request;
import edu.nju.broker.model.Response;

public interface SecurityIntercepter {
	
	//这一步之前就需要把operation处理好，变为request
	public void preHandle(Request request,Response response);

	
	public void postHandle(Request request,Response reponse);
	
	
	public void afterCompletion(Request request,Response reponse);

}
