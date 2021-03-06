
public abstract class Duck {

  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public Duck() {

  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys");
  }
}
