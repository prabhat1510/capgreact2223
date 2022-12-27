package firstjavaproject.enums;

public class EnumWithConstructor {

	public static void main(String[] args) {
		System.out.println(CoffeeSizeWithConstructor.valueOf("BIG"));
		//System.out.println(CoffeeSizeWithConstructor.values());
		
		if(CoffeeSizeWithConstructor.valueOf("BIG").equals(CoffeeSizeWithConstructor.BIG)) {
			CoffeeSizeWithConstructor cs = CoffeeSizeWithConstructor.BIG;
			System.out.println(cs.ounces);
			System.out.println(cs.getOunces());
			
		}
	}

}
