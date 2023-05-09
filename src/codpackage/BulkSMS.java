package codpackage;

public abstract class BulkSMS implements BlukSMSInterface{
	
		
		public abstract void createnetworkconnection();
		public abstract void disconncetnetworkconnection();
		
		public void DND() {
			System.out.println("dnd number list");
		}
		public void telecomregulations() {
			System.out.println("telecom regulation");
		}
		
		

	}


