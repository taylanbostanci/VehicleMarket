

public abstract class ShapeBridge {

	protected ColorI color;


	public ShapeBridge(ColorI c) {

		this.color=c;
	}

	abstract public void paint();
}
