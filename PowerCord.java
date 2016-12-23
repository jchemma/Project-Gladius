public class PowerCord extends Misc {
    
    public String name;
    public String owner;
    public String color;
    
    public PowerCord(String name , String owner, String color, String location) {
        super(location);
        this.name = name;
        this.owner = owner;
        this.color = color;
    }
}
