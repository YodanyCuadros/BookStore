import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Member> membersList;
    private List<Book> booksList;

    public Bookstore() {
        membersList = new ArrayList<>();
        booksList = new ArrayList<>();
    }

    public List<Member> getMembersList() {
        return membersList;
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void addMember(Member member) {
        membersList.add(member);
    }

    public void removeMember(Member member) {
        membersList.remove(member);
    }

    public void addBook(Book book) {
        booksList.add(book);
    }

    public void removeBook(Book book) {
        booksList.remove(book);
    }

    public void purchaseBook(Member member, Book book) {
        if (membersList.contains(member) && booksList.contains(book)) {
            if (!member.isPremiumMember() || (member.isPremiumMember() && book.getBookPrice() * (1 - ((PremiumMember) member).getDiscount()) <= 0)) {
                System.out.println("Member is not eligible for purchase.");
            } else {
                // Implement purchase logic here
                System.out.println("The Purchase is successful.");
            }
        } else {
            System.out.println("Member or book was not found in the bookstore. Please try again");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("The Available Books are :");
        for (Book book : booksList) {
            System.out.println(book.getBookTitle() + " by " + book.getBookAuthor() + " - $" + book.getBookPrice());
        }
    }

    public void displayMemberDetails(Member member) {
        System.out.println("The Member Details:");
        System.out.println("Name: " + member.getName());
        System.out.println("Address: " + member.getAddress());
        System.out.println("Email: " + member.getEmail());
        System.out.println("Premium Member: " + (member.isPremiumMember() ? "Yes" : "No"));
    }
}
