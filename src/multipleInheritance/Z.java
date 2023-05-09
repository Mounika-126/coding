package multipleInheritance;

public class Z implements X,Y{

	@Override
	public void disc() {
		// Y.super.disc();
		X.super.disc();
	}

}
