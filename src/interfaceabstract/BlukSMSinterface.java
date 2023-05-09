package interfaceabstract;

public interface BlukSMSinterface {
	
	public abstract void createNetworkconnection(); // exclusive  methods
	public abstract void disconnectNetworkconnection();//exculsive method
	public abstract void DND();  //common for all the vendor
	public abstract void Telecomregulations(); // common for all vendor
	
}
