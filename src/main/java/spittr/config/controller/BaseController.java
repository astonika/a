package spittr.config.controller;

import spittr.config.User;

public class BaseController {

	protected User getSessionUser() {
		return null;
	}
	
	protected void redirect() {
		
	}
	
	protected void checkLogined() {
		
	}
	
	public String getAppbaseUrl() {
		return null;
	}
	
	public int getPageNo() {
		return 0;
	}

}
