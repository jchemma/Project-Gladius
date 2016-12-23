public class Board extends Audio {

    private String type;
    
    public Board(String type , String location) {
        super(location);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
}
