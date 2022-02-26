
import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    Character2Run();    
  }

  public static void Character1Run()
  {
    ArrayList<Character1> characters = new ArrayList<Character1>();

    Character1 c = new Character1();
    c.firstName = "Zaphod";
    c.surname = "Beeblebrox";
    characters.add(c);

    c = new Character1();
    c.firstName = "Ford";
    c.surname = "Prefect";
    characters.add(c);

    c = new Character1();
    c.firstName = "Arthur";
    c.surname = "Dent";    
    characters.add(c);

    c = new Character1();
    c.firstName = "Deep";
    c.surname = "Thought";
    characters.add(c);

    c = new Character1();
    c.firstName = "Tricia";
    c.surname = "McMillan";
    characters.add(c);

    for (Character1 x: characters) {
        System.out.println(x.firstName + " " + x.surname);
    }
  }
  public static void Character2Run()
  {
    ArrayList<Character2> characters = new ArrayList<Character2>();

    Character2 c = new Character2();
    c.setName("Zaphod Beeblebrox");
    characters.add(c);

    c = new Character2();
    c.setName("Ford Prefect");
    characters.add(c);

    c = new Character2();
    c.setName("Arthur Dent");
    characters.add(c);

    c = new Character2();
    c.setName("Deep Thought");
    characters.add(c);

    c = new Character2();
    c.setName("Tricia McMillan");
    characters.add(c);

    for (Character2 x: characters) {
        System.out.println(x.getName());
    }
  }
}