package sukkiri_3.ch10;

public class PoisonMatango extends Matango {
    protected int poisonableCount = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonableCount > 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ！");
            poisonableCount -= 1;
        }
    }

}