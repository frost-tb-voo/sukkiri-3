package sukkiri_3.ch10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPoisonMatango {
    @Test
    public void testAttack() {
        Hero h = new Hero();
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
        assertEquals(4, pm.poisonableCount);
    }
}