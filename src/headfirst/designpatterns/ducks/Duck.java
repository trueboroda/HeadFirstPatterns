package headfirst.designpatterns.ducks;

public abstract class Duck {

	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;

	public Duck() {

	}

	public abstract void display();

	public void swim() {
		System.out.println("All ducks float");
	}

	public void perfomFly() {
		flyBehavior.fly();
	}

	public void perfomQuack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(IFlyBehavior fb) {
		flyBehavior = fb;

	}

	
	public void setQuackBehavior(IQuackBehavior qb) { 
		quackBehavior = qb; 
	}

}
