public class Film {
    private String name;
    private int ageRating;
    
    public Film(String setName, int setAgeRating) {
        this.name = setName;
        this.ageRating = setAgeRating;
    }
    
    public String name() {
        return name;
    }
    
    public int ageRating() {
        return ageRating;
    }
}
