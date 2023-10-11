import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("The Bookstore Menu:");
            System.out.println("1. Add a Member");
            System.out.println("2. Remove a Member");
            System.out.println("3. Add a Book");
            System.out.println("4. Remove a Book");
            System.out.println("5. Purchase a Book");
            System.out.println("6. Display the Available Books");
            System.out.println("7. Display the Member Details");
            System.out.println("8. Exit bookstore");

            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Please enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Please Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Please Enter Member Address: ");
                    String memberAddress = scanner.nextLine();
                    System.out.print("Please Enter Member Email: ");
                    String memberEmail = scanner.nextLine();

                    // Create a Member object and add it to the bookstore
                    Member member = new Member(memberId, memberName, memberAddress, memberEmail);
                    bookstore.addMember(member);
                    System.out.println("The member successfully added.");
                    break;
                case 2:
                    System.out.print("Enter the Member ID to remove: ");
                    int memberIdToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Find and remove the member from the bookstore
                    Member memberToRemove = null;
                    for (Member m : bookstore.getMembersList()) {
                        if (m.getMemberId() == memberIdToRemove) {
                            memberToRemove = m;
                            break;
                        }
                    }
                    if (memberToRemove != null) {
                        bookstore.removeMember(memberToRemove);
                        System.out.println("The Member successfully removed.");
                    } else {
                        System.out.println("Member not found. Please try again");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Book ISBN: ");
                    String bookISBN = scanner.nextLine();
                    System.out.print("Enter the Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter the Book Author: ");
                    String bookAuthor = scanner.nextLine();
                    System.out.print("Enter the Book Price: ");
                    double bookPrice = scanner.nextDouble();

                    // Create a Book object and add it to the bookstore
                    Book book = new Book(bookISBN, bookTitle, bookAuthor, bookPrice);
                    bookstore.addBook(book);
                    System.out.println("Book successfully added.");
                    break;
                case 4:
                    System.out.print("Enter Book ISBN to remove: ");
                    String bookISBNToRemove = scanner.nextLine();

                    // Find and remove the book from the bookstore
                    Book bookToRemove = null;
                    for (Book b : bookstore.getBooksList()) {
                        if (b.getBookISBN().equals(bookISBNToRemove)) {
                            bookToRemove = b;
                            break;
                        }
                    }
                    if (bookToRemove != null) {
                        bookstore.removeBook(bookToRemove);
                        System.out.println("Book successfully removed.");
                    } else {
                        System.out.println("Book not found. Please try again");
                    }
                    break;
                case 5:
                    System.out.print("Enter the  Member ID: ");
                    int purchaseMemberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book ISBN to purchase: ");
                    String purchaseISBN = scanner.nextLine();

                    // Find the member and book in the bookstore
                    Member purchaseMember = null;
                    Book purchaseBook = null;
                    for (Member m : bookstore.getMembersList()) {
                        if (m.getMemberId() == purchaseMemberId) {
                            purchaseMember = m;
                            break;
                        }
                    }
                    for (Book b : bookstore.getBooksList()) {
                        if (b.getBookISBN().equals(purchaseISBN)) {
                            purchaseBook = b;
                            break;
                        }
                    }

                    if (purchaseMember != null && purchaseBook != null) {
                        bookstore.purchaseBook(purchaseMember, purchaseBook);
                    } else {
                        System.out.println("Member or book was not found.");
                    }
                    break;
                case 6:
                    bookstore.displayAvailableBooks();
                    break;
                case 7:
                    System.out.print("Enter the Member ID to display details: ");
                    int memberIdToDisplay = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Find and display member details
                    Member memberToDisplay = null;
                    for (Member m : bookstore.getMembersList()) {
                        if (m.getMemberId() == memberIdToDisplay) {
                            memberToDisplay = m;
                            break;
                        }
                    }
                    if (memberToDisplay != null) {
                        bookstore.displayMemberDetails(memberToDisplay);
                    } else {
                        System.out.println("Member was not found sorry.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
