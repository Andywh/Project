package model;

public class UserInfo {
	private String userName;
	private String passWord;
	private int level;
	private int money;
	
	public UserInfo(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
		this.level = 1;
		this.money = 10;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassWord() {
		return this.passWord;
	}

	public int getLevel() {
		return this.level;
	}

	public int getMoney() {
		return this.money;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}
