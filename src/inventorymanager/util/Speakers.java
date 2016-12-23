public class Speakers extends Audio {

    private String name;
    
    public Speakers(String name, String location) {
        super(location);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
