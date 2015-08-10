package headfirst.designpatterns.ducks;

public class Squeak implements IQuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");

	}
}
