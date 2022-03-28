public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
       boolean flag = false;
       if ((this.balance - amount) >= 0) {
           this.balance -= amount;
           flag = true;
       }
       return flag;
    }
}
