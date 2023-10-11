public class Book {
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private double bookPrice;

    public Book(String ISBN, String title, String author, double price) {
        this.bookISBN = ISBN;
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookPrice = price;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }
}
