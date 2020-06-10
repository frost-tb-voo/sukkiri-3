package sukkiri_3.ch10;

public class SuperSuper {
    public static void main(String args[]) {
        new SuperSuper().new SubSub().run();
    }

    protected class Root {
        public void run() {
            System.out.println("root");
        }
    }

    protected class Sub extends Root {
        public void run() {
            System.out.println("sub");
        }
    }

    protected class SubSub extends Sub {
        public void run() {
            // super.super.run();
            super.run();
        }
    }
}
