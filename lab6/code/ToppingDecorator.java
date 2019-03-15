package fiveguys;  

public abstract class ToppingDecorator implements Component {
	protected Component component;

	public ToppingDecorator(Component component) {
		this.component = component;
	}

	@Override
	public abstract String getDescription(String usecase);

	@Override
	public void addComponent(Component c) {
	};

	@Override
	public void removeComponent(Component c) {
	};
}
