/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;

import inventorymanager.util.Item;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author jchemma
 */
public class InventoryManager extends Application {
    
    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Item> itemType = FXCollections.observableArrayList();
    
    public InventoryManager(){
        //add item types here
    }
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Inventory Manager");
        initRootLayout();
        showInventoryManager();
    }
    
    public void initRootLayout(){
        
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(InventoryManager.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }        
    }
    
    public void showInventoryManager(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(InventoryManager.class.getResource("view/InventoryManager.fxml"));
            AnchorPane inventoryManagerPane = loader.load();
            
            rootLayout.setCenter(inventoryManagerPane);
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
