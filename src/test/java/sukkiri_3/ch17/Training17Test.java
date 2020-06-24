package sukkiri_3.ch17;

import static org.junit.Assert.fail;

import org.junit.Test;

public class Training17Test {
    @Test
    public void test01() {
        try {
            String s = null;
            System.out.println(s.length());
            fail();
        } catch (NullPointerException e) {

        }
    }

    public void test02() {
        try {
            String s = null;
            System.out.println(s.length());
            fail();
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + "例外を catch しました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace(System.out);            
            System.out.println("ーースタックトレース（ここまで）ーー");
        }
    }
    
    public void test03() {
        try {
            int i = Integer.parseInt("三");
            fail();
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName() + "例外を catch しました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace(System.out);            
            System.out.println("ーースタックトレース（ここまで）ーー");
        }
    }
}