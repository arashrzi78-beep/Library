//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library(30);

        Author author1 = new Author("J.K.", "Rowling", "British");
        Author author2 = new Author("George", "Orwell", "British");

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", author1, 309);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", author1, 341);
        Book book3 = new Book("1984", author2, 328);
        Book book4 = new Book("Animal Farm", author2, 112);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Titles of all books in the library: ");
        library.listBooksTitle();

        System.out.println("Total number of pages in the library: " + library.getTotalPages());
    }
}