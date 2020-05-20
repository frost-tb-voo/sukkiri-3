package sukkiri_3.ch4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Training04Test {
    @Test
    public void test01() {
        // primitive
        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] answers = new boolean[3];
        // object
        String[] names = new String[3];
        java.util.Base64[] colors = new java.util.Base64[1];
        for (String name : names) {
            // zero values of objects are null
            System.out.println("name: " + name);
        }
    }

    @Test
    public void test02() {
        int[] moneyList = { 121902, 8302, 55100 };
        for (int ii = 0; ii < moneyList.length; ii++) {
            System.out.println("$" + moneyList[ii]);
        }
        System.out.println();
        for (int money : moneyList) {
            System.out.println("$" + money);
        }
    }

    @Test
    public void test03() {
        int[] counts = null;
        float[] heights = { 171.3F, 175.0F };
        if (true) {
            System.out.println(counts[1]);
        }
        System.out.println(heights[2]);
    }

    @Test
    public void test04() {
        // TODO
    }

}
