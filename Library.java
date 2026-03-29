import java.sql.SQLOutput;

public class Library {
    private Book[] books;
    private int count;
    public Library(int capacity) {
        this.books = new Book[capacity];
        count = 0;
    }
    public void addBook (Book book){
        if(count < books.length){
            books[count] = book;
            count++;
        }
        else{
            System.out.println("library if full , cannot add book");
        }
    }
    public void listBooksTitle(){
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].getTitle());
        }
    }
    public int getTotalPages(){
        int totalPages = 0;
        for (int i = 0; i < count; i++) {
            totalPages+=books[i].getNumOfPages();
        }
        return totalPages;
    }
}
