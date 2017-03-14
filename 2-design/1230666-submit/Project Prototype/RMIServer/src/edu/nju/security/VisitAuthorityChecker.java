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
	 * 定义用户
	 */
	public void findPresentUser(){
		//TODO
		//不懂得话请@孙康
	}
	
	/**
	 * 限制访问范围
	 * @param user
	 */
	public void locateUserRange(Account user){
		//TODO
		//不懂得话请@孙康
	}

}
