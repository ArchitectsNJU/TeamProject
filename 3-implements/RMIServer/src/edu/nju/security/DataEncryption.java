package edu.nju.security;

import edu.nju.monitor.HeartbeatChecker;

public class DataEncryption {

	private HeartbeatChecker heartbeatChecker;
	
	public DataEncryption() {
		super();
		this.heartbeatChecker = HeartbeatChecker.getInstance();
	}

	/**
	 * Êı¾İ¼ÓÃÜ
	 * @param data
	 */
	public void encryptData(Object data){
		//TODO
	}
	
}
