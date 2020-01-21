package spittr.config;

/**
 * @author xiaoyaoyao
 * 论坛用户登录日志
 *
 */
public class LoginLog extends BaseDomain {
	
	private String ip;
	private String loginDate;
	private User user;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
