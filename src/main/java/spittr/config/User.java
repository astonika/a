package spittr.config;

import java.util.Date;
import java.util.Set;

/**
 * @author xiaoyaoyao
 * 论坛用户
 *
 */
public class User extends BaseDomain {
	
	private int userId;
	private String userName;
	private String password;
	private long userType;
	private long locked;
	private int credit;
	private Date lastVisit;
	private String lastIp;
	private Set mainBoards;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getUserType() {
		return userType;
	}
	public void setUserType(long userType) {
		this.userType = userType;
	}
	public long getLocked() {
		return locked;
	}
	public void setLocked(long locked) {
		this.locked = locked;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Set getMainBoards() {
		return mainBoards;
	}
	public void setMainBoards(Set mainBoards) {
		this.mainBoards = mainBoards;
	}
	
}
