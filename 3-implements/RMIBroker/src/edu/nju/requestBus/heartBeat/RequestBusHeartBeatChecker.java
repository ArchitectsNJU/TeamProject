package edu.nju.requestBus.heartBeat;

public class RequestBusHeartBeatChecker {
	
	
	private RequestBusHeartBeatChecker() {
		super();
		maxTimeInterval=100;
		
	}


	private static RequestBusHeartBeatChecker instance;
	
	private int maxTimeInterval;
	
	
	//���Ź����ƣ�ȡ������
	public void cancelWarning(){
		
	}

	
	public static RequestBusHeartBeatChecker getInstance(){
		if(instance==null){
			synchronized (RequestBusHeartBeatChecker.class) {
				if(instance==null)
				instance=new RequestBusHeartBeatChecker();
			}
		}
		return instance;
		
	}
}
