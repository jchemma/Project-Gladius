public class Cart extends Misc {
    
    private String type;
    
    public Cart(String type , String location) {
        super(location);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
}
