package assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class main extends Application {
    
    @Override
    public void start(Stage stage){
        
        try
        {
        Parent mainroot = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
        String css = this.getClass().getResource("mainLoginRegBackground.css").toExternalForm();
        Scene scene = new Scene(mainroot);
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("PUZZLE MANIA");
        stage.show();
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
