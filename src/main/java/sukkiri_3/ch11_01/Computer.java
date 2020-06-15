package sukkiri_3.ch11_01;

public class Computer extends TangibleAsset {
    String makerName;

    public Computer(String name, int price, String color, String makerName) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }

}