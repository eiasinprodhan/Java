package librarymanagementsystem;

public class Book extends Item{
    String isbn;
    String genre;

    public Book() {
    }

    public Book(String isbn, String genre) {
        this.isbn = isbn;
        this.genre = genre;
    }

    public Book(String isbn, String genre, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void getDetails() {
        System.out.println("Book's Details");
        super.getDetails();
        System.out.println("ISBN: " + isbn
        + "\nGenre: " + genre);
    }
    
    
    
    
}
