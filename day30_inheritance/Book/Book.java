package day30_inheritance.Book;

public class Book {

    private String title, type, author;
    private double price;

    public Book(String title, String type, String author, double price) {
        setTitle(title);
        setType(type);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
create a class named Book:
			variables:
				title, type, author, price

			Encapsulate all the fields
					Conditions:
						1. price can not be set to negative

			Add a constructor that can set all the fields

			Methods:
				toString()
 */