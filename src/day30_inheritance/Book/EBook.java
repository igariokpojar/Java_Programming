package day30_inheritance.Book;

public class EBook extends Book {

    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int ages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<= 0){
            System.err.println("Invalid Pages: "+pages);
            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook() {
        System.out.println("reading " + getTitle());
    }

    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
 Create a subclass of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()

 */