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

	
	//�ѵõ����������������У�������
	public boolean addNewRequest(Operation operation) {
		try {
			queue.add(operation);
			return true;
		} catch (Exception e) {

		}
		return false;
	}

	
	
	//��ʼ�������󣬰����������չ
	//Ȼ���������õ�һ��reuslt�����ؿͻ���
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
