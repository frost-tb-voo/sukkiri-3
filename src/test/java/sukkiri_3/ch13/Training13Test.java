package sukkiri_3.ch13;

import static org.junit.Assert.fail;

import org.junit.Test;

import sukkiri_3.ch13_04.Wand;
import sukkiri_3.ch13_04.Wizard;

public class Training13Test {
    @Test
    public void test04() {
        try {
            new Wand("ボ", 0.6);
            fail("名前３文字以上");
        } catch (IllegalArgumentException e) {
        }
        try {
            new Wand("ｈｎｋのぼう", 101);
            fail("増幅率１００以下");
        } catch (IllegalArgumentException e) {
        }
        try {
            new Wand("ｈｎｋのぼう", 0.1);
            fail("増幅率０．５以上");
        } catch (IllegalArgumentException e) {
        }

        Wand wand = new Wand("ｈｎｋのぼう", 0.6);
        new Wizard("ｈｎｋ", wand, 1, 1);

        try {
            new Wizard("ｋ", wand, 1, 1);
            fail("名前３文字以上");
        } catch (IllegalArgumentException e) {
        }

        try {
            new Wizard("ｈｎｋ", null, 1, 1);
            fail("必ず杖を装備する");
        } catch (IllegalArgumentException e) {
        }

        try {
            new Wizard("ｈｎｋ", wand, 1, -1);
            fail("ｍｐ０以上");
        } catch (IllegalArgumentException e) {
        }
    }
}