package codpackage;

public class Tmobile extends BulkSMS{

	@Override
	public void createnetworkconnection() {
	System.out.println("create ntework");
	}

	@Override
	public void disconncetnetworkconnection() {
		System.out.println("disconnect network");
	}	

}
