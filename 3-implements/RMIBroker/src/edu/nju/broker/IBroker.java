package edu.nju.broker;

import edu.nju.broker.model.Request;
import edu.nju.broker.model.Result;

public interface IBroker {
	

	
	//�������ߵĶ��д�����Ϣ��Ȼ��broker����
	//�õ��������result����ʽ����
	//ʵ�ֵ�ʱ��ע��request������Ӧ�ú����û���˭��������Ϣ
	//�����ſ��԰ѽ�����ظ�������������û�
	public Result handleRequest(Request request);
	
	
	
	
	
	
	
}
