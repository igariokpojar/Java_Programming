package day30_inheritance.cryptotask;

public class CryptoToken {

    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        setPrice(price);
        setQuantity(quantity);
        setMarketCap(marketCap);
        setCirculatingSupply(circulatingSupply);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {
        if(quantity < 0 ){
            System.err.println("Invalid quantity: "+quantity);
            System.exit(1);
        }
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }


    public double totalPrice(){
        return price * quantity;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

}
