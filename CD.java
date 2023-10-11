public class CD extends Book {
    private int durationInMinutes;

    public CD(String ISBN, String title, String author, double price, int durationInMinutes) {
        super(ISBN, title, author, price);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
