package inventorymanager.util;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item{
    
    private final StringProperty name;
    private final StringProperty location;
    private final DoubleProperty cost;
    private final IntegerProperty size;
    
    public Item(){
        this(null,null,null,null);
    }
    
    public Item(String name, String location, Double cost, Integer size){
        this.name = new SimpleStringProperty(name);
        this.location = new SimpleStringProperty(location);
        this.cost = new SimpleDoubleProperty(cost);
        this.size = new SimpleIntegerProperty(size);
    }
    
    public String getName(){
        return name.get();
    }
    
    public void setName(String newName){
        name.set(newName);
    }
    
    public StringProperty getNameProperty(){
        return name;
    }
    
    public String getLocation(){
        return location.get();
    }
    
    public void setLocation(String newLocation){
        location.set(newLocation);
    }
    
    public StringProperty getLocationProperty(){
        return location;
    }
    
    public double getCost(){
        return cost.get();
    }
    
    public void setCost(double newCost){
        cost.set(newCost);
    }
    
    public DoubleProperty getCostProperty(){
        return cost;
    }
    
    public int getSize(){
        return size.get();
    }
    
    public void setSize(int newSize){
        size.set(newSize);
    }
    
    public IntegerProperty getIntegerProperty(){
        return size;
    }
}