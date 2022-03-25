public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String setTitle, int setPages, int setYear) {
        this.title = setTitle;
        this.pages = setPages;
        this.publicationYear = setYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    @Override
    public String toString() {
       return title+", "+pages+" pages, "+publicationYear; 
    }
}
