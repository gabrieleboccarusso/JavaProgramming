public class Fitbyte {
    private int age;
    private int restingHeartrate;
    
    public Fitbyte(int age, int restingHeartrate) {
        this.age = age;
        this.restingHeartrate = restingHeartrate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        
        return (maxHeartRate - this.restingHeartrate) * (percentageOfMaximum) + this.restingHeartrate;
    }
}
