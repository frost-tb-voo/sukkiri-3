package sukkiri_3.ch06_00;

public class Main_Original {
    public static void main(String[] args) {
        doWarusa();
        doTogame();
        callDeae();
        showMondokoro();
    }

    public static void doWarusa() {
        System.out.println("きなこでござる。食えませんがの。");
    }

    public static void doTogame() {
        System.out.println("この老いぼれの目はごまかせませんぞ。");
    }

    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }

    public static void showMondokoro() {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所がめにはいらぬか！");
        doTogame(); // もう一度、とがめる
    }
}