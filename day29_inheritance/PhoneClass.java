package src.day29_inheritance;

public class PhoneClass {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        if (brand == null) {
            brand = "Unknown";
        }
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank()) {
            System.err.println("Invalid input");
        }

        this.brand = brand;
    }

    public String getModel() {
        if (model == null) {
            brand = "Unknown";
        }
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank()) {
            System.err.println("Invalid input");
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        if (color == null) {
            color = "Unknown";
        }
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()) {
            System.err.println("Invalid input");
        }
        this.color = color;
    }

    public void call(long phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement
 */