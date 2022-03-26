public class Timer {
    ClockHand seconds = new ClockHand(60);
    ClockHand hundredths = new ClockHand(100);
    
    
    public void advance() {
        this.hundredths.advance();
        
        if (hundredths.value() == 0) {
            this.seconds.advance();   
        }
    }
      
    @Override
    public String toString() {
        return this.seconds.toString() + ":" + this.hundredths.toString();
    }
}

