package interfacepkg;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		System.out.println("==== SAMSUNG ====");
	}

	@Override
	public void sendCall() {
		System.out.println("==== SAMSUNG CALL ====");
	}
	
	public static void main(String [] args) {
		PhoneInterface phone = new SamsungPhone();
		
		SamsungPhone sPhone = new SamsungPhone();
		sPhone.printLogo();
		sPhone.sendCall();
	}

}
