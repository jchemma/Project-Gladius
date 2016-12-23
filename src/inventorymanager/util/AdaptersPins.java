public class AdaptersPins extends Audio {
    
    private String type;
    
    public AdaptersPins(String type , String location) {
        super(location);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }

}