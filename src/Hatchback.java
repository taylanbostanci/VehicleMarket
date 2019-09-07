
public class Hatchback extends ShapeBridge{

	
	public Hatchback(ColorI c) {
		
		super(c);                   // sub class connect the abstract class (shape) 
	}
	
	public void paint() {
		
		System.out.println("Type: Hatchback");
		color.paint();
	}
}
