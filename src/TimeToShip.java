
public class TimeToShip {

	public static void main(String[] args) {
		
		Box <Nokia> boxOfPhones = new Box <>();
		
		Box <BlackBerry> boxOfPhones2 = new Box<>();
		
		ShippingOrder<String, Box<Nokia>> so1=
				new ShippingOrder<>("ph1234",boxOfPhones);
		
		ShippingOrder<String, Box<BlackBerry>> so2=
				new ShippingOrder<>("ph4321",boxOfPhones2);
				
	}

}
