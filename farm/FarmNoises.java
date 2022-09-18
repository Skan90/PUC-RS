package farm;

import java.nio.charset.StandardCharsets;

public class FarmNoises {
  public static void main(String[] args) {
    // Animal tipo estático e Cow/Dog/etc dinâmico, aqui temos polimorfismo.
    // Animal mimosa = new Cow();
    // Animal celso = new Dog();
    // Animal lilica = new Chicken();

    // mimosa.talk();
    // celso.talk();
    // lilica.talk();

    // Spring vai ganhar vários controladores
    // O controlador novo é adicionado a lista de servidor e o Spring gerencia a
    // execução de cada um.
    // Polimorfismo para gerenciar uma lista em que cada elemento é de uma classe
    // diferente, mas todos tem o mesmo compromisso da classe Animal.

    // Array, Classe Abstrata, Herança e Polimorfismo
    Talker[] farm = {
        new Radio(),
        new Cow("Mimosa"),
        new Chicken("Lilica"),
        new Chicken("Lola"),
        new Chicken("Zezé"),
        new Dog("Celso"),
        new Cat("Júlio")
    };

    // Código Spring, gerêrico, que usa Polimorfismo através de Animal.
    // Para O Spring gerênciar as Classes criadas, as Classes concretas,
    // tem que ter ligações com as Classes fornecidas do Spring.
    int i = 0;

    while (i < farm.length) {
      Talker t = farm[i];
      System.out.println(t);
      t.talk();
      if (t instanceof Flying) {
        Flying f = ((Flying) t);
        f.fly();
      }
      i++;
    }
  }
}
