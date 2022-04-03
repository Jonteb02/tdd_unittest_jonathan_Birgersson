package se.jonathanb;

public abstract class Games {
    protected double price;

    public Games(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Games{" +
                "price=" + price +
                '}';
    }
}
