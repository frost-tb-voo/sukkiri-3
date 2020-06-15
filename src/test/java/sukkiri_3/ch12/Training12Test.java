package sukkiri_3.ch12;

import org.junit.Test;

import sukkiri_3.ch12_03.*;

public class Training12Test {
    @Test
    public void test03() {
        Y[] ys = { new A(), new B() };
        for (Y y : ys) {
            y.b();
        }
    }
}