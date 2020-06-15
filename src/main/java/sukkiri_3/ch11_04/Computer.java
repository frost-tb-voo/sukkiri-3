package sukkiri_3.ch11_04;

public class Computer extends TangibleAsset {
    String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }

}