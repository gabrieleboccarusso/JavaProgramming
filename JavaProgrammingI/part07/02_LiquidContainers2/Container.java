public class Container {
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int value) {
        if (this.getFilled(value)) {
            this.amount = 100;
        } else if (value > 0) {
            this.amount += value;
        }
    }
    
    public boolean getFilled(int value) {
        boolean flag = false;
        if (this.amount + value > 100) {
            flag = true;
        }
        
        return flag;
    }

    public void remove(int value) {    
        this.amount = (this.amount - value < 0) ? 0 : this.amount - value;
    }
    
    public void move(int value, Container container) {
        if (value > this.amount) {
            container.add(this.contains());
            this.amount = 0;
        } else {
            container.add(value);
            // use remove method
            this.amount -= value;
        }
    }
    
    @Override
    public String toString() {
        return this.contains() + "/100";
    }
}
