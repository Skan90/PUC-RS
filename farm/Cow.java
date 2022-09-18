package farm;

public class Cow extends Animal {

  public Cow(String name) {
    super(name);
  }

  public void talk() {
    System.out.printf("%s talks muuu\n", name);
  }
}
