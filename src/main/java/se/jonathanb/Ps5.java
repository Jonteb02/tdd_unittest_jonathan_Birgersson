package se.jonathanb;

public class Ps5 extends Games{
    private String type;

    public Ps5(double price, String type){
        super(price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Game{" +
                "price=" + price +
                ", type='" + type +
                '\'' +
                '}';
    }
}
