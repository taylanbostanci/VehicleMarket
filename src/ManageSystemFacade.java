
public class ManageSystemFacade implements BrandI,ColorI,TypeI{


	private final ManageSystem  manageSystem;

	public ManageSystemFacade(ManageSystem manageSystem) {
		this.manageSystem= manageSystem;
	}                                                                //facade class connect all interface and use for own methods


	@Override
	public void type() {
		manageSystem.selectType();

	}

	@Override
	public void paint() {
		manageSystem.selectShape();
		manageSystem.selectColor();

	}

	@Override
	public void brand() {
		manageSystem.selectBrand();
		manageSystem.selectModel();

	}

}
