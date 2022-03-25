public class Statistics {
    private int count;
    private int sum;
 
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
 
    public void addNumber(int number) {
        count++;
        sum += number;
    }
 
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        double avg = 0;
        if (count > 0) {
            avg = 1.0 * sum/count;
        }

        return avg;
    }
}
