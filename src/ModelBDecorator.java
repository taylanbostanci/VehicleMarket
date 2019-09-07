

public class ModelBDecorator extends BrandDecorator{
	
	public ModelBDecorator(BrandI decoratedBrand) {
		super(decoratedBrand);
		
	}

	public void brand() {
		                                    //same processing like modelA
		decoratedBrand.brand();
		
		
		setModel(decoratedBrand);
	}
private void setModel(BrandI decoratedBrand) {
	
	System.out.println("Model B");
	
}
}