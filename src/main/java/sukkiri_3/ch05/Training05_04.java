package sukkiri_3.ch05;

public class Training05_04 {
    public static void main(String[] args) {
        double bottom = 10;
        double height = 5;
        System.out.println(new Training05_04().calcTriangleArea(bottom, height));

        double radius = 5;
        System.out.println(new Training05_04().calcCircleArea(radius));
    }

    public double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public double calcCircleArea(double radius) {
        return radius * radius * java.lang.Math.PI;
    }

}