
public class ModelState implements BrandI  {

	public  BrandI brand;

	public void setBrandI(BrandI brandI) {
		this.brand=brandI;
	}

	public  BrandI getBrandI() {
		return this.brand;
	}
	public void brand() {                //Notice that Context also implements State 

		this.brand.brand();         // keep a reference of its current state 

		//forwards the request to the state implementation.
	} 

}
