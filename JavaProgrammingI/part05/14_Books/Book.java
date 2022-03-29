public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared) {
        boolean flag = false;
        
        if (this == compared) {
            flag = true;
        } else if (compared instanceof Book) {
            Book comparedBook = (Book) compared;
            
            flag = this.name.equals(comparedBook.getName()) &&
                    this.publicationYear == comparedBook.getPublicationYear();
        }
        
        return flag;
    }
}
