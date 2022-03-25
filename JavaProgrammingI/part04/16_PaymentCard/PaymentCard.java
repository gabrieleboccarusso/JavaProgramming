public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        double eatAffordablyAmount = 2.60;

        if (balance >= eatAffordablyAmount) {
            balance -= eatAffordablyAmount;
        }
    }
 
    public void eatHeartily() {
        double eatHeartilyAmount = 4.60;

        if (balance >= eatHeartilyAmount) {
             balance -= eatHeartilyAmount;
         }
    }
    
    public void addMoney(double amount) {
        double limit = 150.00;

        if (amount > 0) {
            if (amount+balance >= limit) {
                balance = limit;
            } else {
                balance += amount;
            }       
        }
    }
}
