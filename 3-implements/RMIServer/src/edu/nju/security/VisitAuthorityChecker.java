package edu.nju.security;

import edu.nju.monitor.HeartbeatChecker;
import edu.nju.po.account.Account;

public class VisitAuthorityChecker {

	private HeartbeatChecker heartbeatChecker;
	
	public VisitAuthorityChecker() {
		super();
		this.heartbeatChecker = HeartbeatChecker.getInstance();
	}

	/**
	 * �����û�
	 */
	public void findPresentUser(){
		//TODO
		//�����û���@�￵
	}
	
	/**
	 * ���Ʒ��ʷ�Χ
	 * @param user
	 */
	public void locateUserRange(Account user){
		//TODO
		//�����û���@�￵
	}

}
