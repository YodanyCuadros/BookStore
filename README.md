# BookStore
Java Bookstore Project
This Java Bookstore Project is a simple console-based application that allows users to manage a bookstore, including adding and removing members, adding and removing books, making book purchases, and more. It serves as a Java-based exercise to demonstrate core programming concepts and interaction with object-oriented principles.


Features
-Member Management: Add and remove members from the bookstore. Each member can have a unique ID, name, address, and email.

-Book Management: Add and remove books from the bookstore. Each book can have a unique ISBN, title, author, and price.

-Book Purchases: Members can purchase books, and the application checks eligibility based on the membership type.

-Display Available Books: View a list of available books in the bookstore.

-Display Member Details: Retrieve details of a member by entering their ID.

Usage
Clone the repository to your local machine:

shell
Copy code
git clone https://github.com/yourusername/java-bookstore.git
Compile the code:

shell
Copy code
javac TestHarness.java
Run the program:

shell
Copy code
java TestHarness
Follow the on-screen menu to interact with the application.

Project Structure
TestHarness.java: The main class containing the entry point of the program. It handles the menu and user interactions.

Bookstore.java: The Bookstore class manages the list of members and books, as well as methods for adding, removing, and displaying data.

Member.java: The Member class represents a bookstore member with ID, name, address, email, and premium membership status.

Book.java: The Book class represents a book with ISBN, title, author, and price.

DVD.java: A subclass of Book for representing DVDs, including director name.

CD.java: A subclass of Book for representing CDs, including duration in minutes.

Contributing
Contributions are welcome! If you'd like to contribute to this project, please fork the repository, make your changes, and submit a pull request. Be sure to follow the project's coding standards and guidelines.


