package sukkiri_3.ch09;

public class Thief {
    String name = "";
    int hp = 40;
    int mp = 5;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Thief(String name, int hp) {
        this(name, hp, 5);
    }

    public Thief(String name) {
        this(name, 40, 5);
    }
}
