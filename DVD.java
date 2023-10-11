public class DVD extends Book {
    private String directorName;

    public DVD(String ISBN, String title, String author, double price, String directorName) {
        super(ISBN, title, author, price);
        this.directorName = directorName;
    }

    public String getDirectorName() {
        return directorName;
    }
}
