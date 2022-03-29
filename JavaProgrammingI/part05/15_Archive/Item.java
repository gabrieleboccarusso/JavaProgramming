public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        boolean flag = false;
        
        if (this == compared) {
            flag = true;
        } else if (compared instanceof Item) {
            Item comparedItem = (Item) compared;
            
            flag = this.identifier.equals(comparedItem.identifier);
        }
        
        return flag;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
