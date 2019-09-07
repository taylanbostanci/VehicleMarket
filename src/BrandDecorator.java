
public abstract class BrandDecorator implements BrandI{

	//this class using for decorator


	protected BrandI decoratedBrand;                  // created new variable

	public BrandDecorator(BrandI decoratorBrand) {   // parameter declared

		this.decoratedBrand=decoratorBrand;
	}


	public void brand() {       // called  methods in interface
		decoratedBrand.brand();
	}

}


