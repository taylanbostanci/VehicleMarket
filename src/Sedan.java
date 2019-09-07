
public class Sedan extends ShapeBridge {

	public Sedan(ColorI c) {

		super(c);
	}
	// sub class connect the abstract class (shape) 
	public void paint() {

		System.out.println("Type: Sedan");
		color.paint();

	}

}
