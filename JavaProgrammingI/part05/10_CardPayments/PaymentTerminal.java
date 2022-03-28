public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private static final double priceAffordableMeal = 2.5; 
    private int heartyMeals;
    private static final double priceHeartyMeal = 4.3;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        double change;
        if (payment >= this.priceAffordableMeal) { 
            this.money += this.priceAffordableMeal;
            this.affordableMeals++;
            change = payment - this.priceAffordableMeal;
        } else {
            change = payment;
        }
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        boolean flag = false;
        if(card.takeMoney(this.priceAffordableMeal)) {
            this.affordableMeals++;
            flag = true;
        }
        
        return flag;
    }

    public double eatHeartily(double payment) {
        double change;
        if (payment >= this.priceHeartyMeal) { 
            this.money += this.priceHeartyMeal;
            this.heartyMeals++;
            change = payment - this.priceHeartyMeal;
        } else {
            change = payment;
        }
        return change;
    }

    public boolean eatHeartily(PaymentCard card) {
        boolean flag = false;
        if(card.takeMoney(this.priceHeartyMeal)) {
            this.heartyMeals++;
            flag = true;
        }
        
        return flag;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);     
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
