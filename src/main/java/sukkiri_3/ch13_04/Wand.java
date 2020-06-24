package sukkiri_3.ch13_04;

public class Wand {
    private String name;
    private double power;

    public Wand(String name, double power) {
        setName(name);
        setPower(power);
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("the length of name must be over 3");
        }
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0.5) {
            throw new IllegalArgumentException("The power must be over 0.5");
        }
        if (power > 100) {
            throw new IllegalArgumentException("The power must be under 100.0");
        }
        this.power = power;
    }
    
}