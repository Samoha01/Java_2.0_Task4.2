package Task4_2;

public class Chocolate extends Sweets {
    private String type;
    public Chocolate(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String taste) {
        this.type = taste;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип шоколада: " + type;
    }
}
