package inventorymanager;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class InventoryManager extends Application{
    
    private Stage primaryStage;
    private BorderPane rootLayout;
    
    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Inventory Manager");
        
        initInventoryManager();
    }
    
    public void initInventoryManager(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(InventoryManager.class.getResource("view/MainPage.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    public Stage getPrimaryStage(){
        return primaryStage;
    }
    
    public static void main(String[]args){
        launch(args);
    }
}