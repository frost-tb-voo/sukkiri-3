package sukkiri_3.ch14_02;

import java.util.Random;

public class Cleric {
    String name;
    int hp;
    final static int MAX_HP = 50;
    int mp;
    final static int MAX_MP = 10;

    public void selfAid() {
        if (this.mp < 5) {
            throw new RuntimeException(name + "'s MP is under 10!'");
        }
        this.mp -= 5;
        this.hp = Cleric.MAX_HP;
    }

    public int pray(int prayingCounts) {
        int upperLimit = MAX_MP - this.mp;
        int recovered = Math.min(upperLimit, prayingCounts + new Random().nextInt(3));
        this.mp += recovered;
        return recovered;
    }
}
