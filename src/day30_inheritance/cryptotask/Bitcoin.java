package day30_inheritance.cryptotask;

public class Bitcoin extends CryptoToken {

    public Bitcoin(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
