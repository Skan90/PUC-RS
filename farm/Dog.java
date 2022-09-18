package farm;

public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  public void talk() {
    System.out.printf("%s talks au au\n", name);
  }

}
