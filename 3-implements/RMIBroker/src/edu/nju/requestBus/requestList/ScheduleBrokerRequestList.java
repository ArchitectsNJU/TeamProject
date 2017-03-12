package edu.nju.requestBus.requestList;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import edu.nju.broker.model.Result;
import edu.nju.requestBus.model.Operation;

public class ScheduleBrokerRequestList implements RequestList{
	
	private ScheduleBrokerRequestList(){
		queue= new ArrayBlockingQueue<Operation>(100);
	}
	
	private static ScheduleBrokerRequestList instance;
	
	Queue<Operation> queue ;

	
	//把得到的请求加入请求队列，被处理
	public boolean addNewRequest(Operation operation) {
		try {
			queue.add(operation);
			return true;
		} catch (Exception e) {

		}
		return false;
	}

	
	
	//开始处理请求，把请求向后扩展
	//然后处理的请求得到一个reuslt，传回客户端
	public Result forwardRequest() {
		
		return null;
		
	}
	
	
	public static ScheduleBrokerRequestList getInstance(){
		if(instance==null){
			synchronized(ScheduleBrokerRequestList.class){
				instance=new ScheduleBrokerRequestList();
			}
		}
		return instance;
	}

}
