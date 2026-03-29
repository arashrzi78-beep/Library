public class Book {
    private String title;
    private Author author;
    private int numOfPages;

    public Book(String title, Author author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getNumOfPages() {
        return numOfPages;
    }

}
