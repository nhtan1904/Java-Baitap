
package VoLamNhatTan_7374.Lec08_ObjectAndClass.Ex2;

public class BasicBook {

    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert C. Martin", 25.0);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 30.0);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}

class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println(title + " | " + author + " | " + price);
    }
}

