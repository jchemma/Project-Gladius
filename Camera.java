public class Camera extends Misc {

    public String type;
    
    public Camera(String type, String location) {
        super(location);
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
}
