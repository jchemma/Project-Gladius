public class Tape extends Misc {
    
    private String type;
    
    public Tape(String type, String location) {
        super(location);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
}
