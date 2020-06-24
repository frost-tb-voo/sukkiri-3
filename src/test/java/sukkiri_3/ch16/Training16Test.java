package sukkiri_3.ch16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Training16Test {
    @Test
    public void test02() {
        Hero saitoh = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(saitoh);
        heroes.add(suzuki);
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }

    @Test
    public void test03() {
        Hero saitoh = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");
        Map<Hero, Integer> killed = new HashMap<>();
        killed.put(saitoh, 3);
        killed.put(suzuki, 7);
        for (Hero hero : killed.keySet()) {
            System.out.println(hero.getName() + "が倒した数＝" + killed.get(hero));
        }        
    }
}