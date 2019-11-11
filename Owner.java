/*
 * Owner class to represent owner of dog being brought in to be groomed. Has private variables representing
 * their name, phone number, and VIP status. Implements comparable, making the owners comparable alphabetically
 *  by name.
 */
public class Owner implements Comparable<Owner> {
	
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

	@Override
	public int compareTo(Owner o) {
		return this.name.compareTo(o.getName());
	}

}
