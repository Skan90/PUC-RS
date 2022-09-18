package farm;

// Modificador: private, protected, abstract, public and 'nothing'
// Se a classe tem ao menos um metódo abtrato, ela obrigatóriamente tem que ser abstrata,
// porém podem existir classes abstratas feitas apenas de metódos concretos.
abstract class Animal extends Object implements Talker {
  protected String name;

  public Animal(String name) {
    setName(name);
  }

  private void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("The Animal name must be DIFFERENT than 'null'!");
    }
    if (name.isEmpty() || name.isBlank()) {
      throw new IllegalArgumentException("The Animal name must be DIFFERENT than 'EMPTY' or 'BLANK'!");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("%s %s", getClass().getName(), name);
  }

  public abstract void talk();
}
