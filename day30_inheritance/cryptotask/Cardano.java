package day30_inheritance.cryptotask;

public class Cardano extends CryptoToken {

    public Cardano(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }
}
/*
 create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)
			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero
			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
 */