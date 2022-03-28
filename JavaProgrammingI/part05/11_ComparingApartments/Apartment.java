public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        boolean flag = false;
        if (this.squares > compared.squares) {
            flag = true;
        }
        
        return flag;
    }
    
    public int priceDifference(Apartment compared) {
        int priceThis = this.squares * this.pricePerSquare;
        int priceCompared = compared.squares * compared.pricePerSquare;
        return abs(priceThis - priceCompared);
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare);
    }
    
    private int abs(int n) {
        if (n < 0) {
            n *= -1;
        }
        
        return n;
    }
}
