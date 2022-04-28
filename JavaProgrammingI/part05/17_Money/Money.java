public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(
                this.euros + addition.euros, 
                this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        boolean flag = false;
        
        if (this.euros == compared.euros) {
            if (this.cents <= compared.cents) {
                flag = true;
            }
        } else if (this.euros <= compared.euros) {
            flag = true;
        }
        
        return flag;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = 0;
        int newCents = 0;
        
        
        if (!this.lessThan(decreaser)) {
            newEuros = this.euros - decreaser.euros;
            newCents = this.cents - decreaser.cents;
            if (newCents < 0) {
                newEuros--;
                newCents = 100 + newCents;
            }
        }
        
        return new Money(newEuros, newCents);
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
