package librarymanagementsystem;

public class DVD extends Item{
    String director;
    int runtime;

    public DVD() {
    }

    public DVD(String director, int runtime) {
        this.director = director;
        this.runtime = runtime;
    }

    public DVD(String director, int runtime, String title, String author, int yearPublished) {
        super(title, author, yearPublished);
        this.director = director;
        this.runtime = runtime;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Director: " + director
        +"Runtime: " + runtime);
    }
    
    
}
