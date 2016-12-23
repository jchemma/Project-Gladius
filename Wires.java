public class Wires extends Audio {

    private String type;
    private int length;
    
    public Wires(String type, int length, String location) {
        super(location);
        this.type = type;
        this.length = length;
    }
    
    public String getType() {
        return type;
    }
    
    public int getLength() {
        return length;
    }
}
