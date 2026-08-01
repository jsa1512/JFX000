package JFX000;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Bonjour JavaFX !");
        
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 200);
        
        
        
        TableauFX tab = new TableauFX(500, 300);
        
        root.getChildren().add(tab);
        

        stage.setTitle("Test JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}