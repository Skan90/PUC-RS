package farm;

public class Chicken extends Animal implements Flying {

  public Chicken(String name) {
    super(name);
  }

  public void fly() {
    System.out.println("flap flap flap");
  }

  public void talk() {
    System.out.printf("%s talks có có có\n", name);
  }
}
