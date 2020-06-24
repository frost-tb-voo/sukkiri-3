package sukkiri_3.ch13_04;

import sukkiri_3.ch13_01.Hero;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
    
    public Wizard(String name, Wand wand, int hp, int mp) {
        setName(name);
        setWand(wand);
        setHp(hp);
        setMp(mp);
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("the length of name must be over 3");
        }
        this.name = name;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("wand must not be null");
        }
        this.wand = wand;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MP must be over 0");
        }
        this.mp = mp;
    }

}