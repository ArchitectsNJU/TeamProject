package edu.nju.security;

import java.util.ArrayList;
import java.util.List;

import edu.nju.broker.model.Request;

public class DenyRecord {
	List denyList;
	
	private DenyRecord(){
		denyList=new ArrayList();
	}
	
	private static DenyRecord instance;
	
	public void recordDeny(Request request){
		
	}
	
	public void handleDeny(){
		
	}
	
	
	public static DenyRecord getInstance(){
		if(instance==null){
			synchronized(DenyRecord.class){
				if(instance==null){
					instance=new DenyRecord();
				}
			}
			
		}
		
		return instance;
	}

}
