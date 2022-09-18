package farm;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  public void talk() {
    System.out.printf("%s talks miau\n", name);

  }

}
