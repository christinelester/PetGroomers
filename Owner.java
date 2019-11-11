
public class Owner {
	
	private String name;
	private String phoneNum;
	private boolean isVip;
	
	public Owner(String name, String phoneNum, boolean isVip) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.isVip = isVip;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public boolean isVip() {
		return isVip;
	}
	
	@Override
	public String toString() {
		return name + ", " + phoneNum;
	}

}
