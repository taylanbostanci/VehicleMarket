

public class ModelADecorator extends BrandDecorator{

	public ModelADecorator(BrandI decoratedBrand) {
		super(decoratedBrand);

	}                                                     //model  decorator class connect with extends token

	public void brand() {                                       
                                                      
		decoratedBrand.brand();  
		
		                                           //new variable created decoratedBrand 
                // adding a new method to the structure by defining a decorator object that implements the structure's interface

                                             //new method created with new parameter and used in method
		setModel(decoratedBrand);
	}
	private void setModel(BrandI decoratedBrand) {

		System.out.println("Model A");

	}
}