package librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book = new Book("978-3-16-148410-0", "Sci-Fi", "Nikolas Tesla", "Eiasin Prodhan", 2025);
        Magazine magazine = new Magazine(100, "30 Days", "Kishor Alo", "Unknown", 2025);
        DVD dvd = new DVD("Salman Khan", 120, "Ek Tha Tiger", "Salman Khan", 2020);
        book.getDetails();
        System.out.println("----------");
        magazine.getDetails();
        System.out.println("----------");
        dvd.getDetails();
    }
    
}
