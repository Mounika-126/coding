package interfaceabstract;

public abstract class BlukSMS implements BlukSMSinterface{
	
	public abstract void createNetworkconnection();
	public abstract void disconnectNetworkconnection();
	
	public void DND() {
		System.out.println("do not distrub");
	}
	public void Telecomregulations() {
		System.out.println("Telecomregulations");
	}
}
