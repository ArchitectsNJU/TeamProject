package edu.nju.security;

import edu.nju.broker.model.Request;
import edu.nju.broker.model.Response;

public class UserAuthority implements SecurityIntercepter{

	
	
	DenyRecord record;
	
	public UserAuthority(){
		record=DenyRecord.getInstance();
	}
	
	
	

	
	
	
	public void validateUser(Request request, Response response){
		
	}
	
	public void authorizeUser(Request request, Response response){
		
	}
	
	public void forbidUser(Request request, Response response){
		
	}

	@Override
	public void preHandle(Request request, Response response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(Request request, Response reponse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(Request request, Response reponse) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
