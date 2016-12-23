public class Subs extends Audio {
    
    private String name;
    
    public Subs(String name, String location) {
        super(location);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
