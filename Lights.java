public class Lights extends Misc {
    
    public String type;
    
    public Lights(String type, String location) {
        super(location);
        this.type = type;
    }
 
    public String getType() {
        return type;
    }
}
