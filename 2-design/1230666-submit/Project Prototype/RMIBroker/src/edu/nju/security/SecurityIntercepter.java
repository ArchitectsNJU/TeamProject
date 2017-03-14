package edu.nju.security;

import edu.nju.broker.model.Request;
import edu.nju.broker.model.Response;

public interface SecurityIntercepter {
	
	//��һ��֮ǰ����Ҫ��operation����ã���Ϊrequest
	public void preHandle(Request request,Response response);

	
	public void postHandle(Request request,Response reponse);
	
	
	public void afterCompletion(Request request,Response reponse);

}
