package sukkiri_3.ch4;

/**
 * Hello world!
 *
 */
public class Training04_04 {
    public static void main(String[] args) {
        new Training04_04().main(System.in);
    }

    public void main(java.io.InputStream in) {
        int[] numbers = { 3, 4, 9 };
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(in).nextInt();
        for (int number : numbers) {
            if (input == number) {
                System.out.println("アタリ！");
            }
        }
    }
}
