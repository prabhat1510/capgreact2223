package firstjavaproject.enums;

public enum CoffeeSizeWithConstructor {
	BIG(8),HUGE(10),OVERWHELMING(16);
	int ounces;
	CoffeeSizeWithConstructor(int i) {
		this.ounces = i;
	}
	public int getOunces() {
		return ounces;
	}
	public void setOunces(int ounces) {
		this.ounces = ounces;
	}
	
	
	
}
