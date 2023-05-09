package codpackage;

public class Plane extends Machine {
	@Override                   //
	public void run()
	{
		super.run();  
		System.out.println("run from child class");
	}
	
	public void run1() {
		System.out.println("from child class");
	}
}
