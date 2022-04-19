import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class Prototype extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primary) throws Exception {
        
        //for top right
        Label insta = new Label("Instagram");
        
        HBox topMenu = new HBox(insta);


        //for setting scene
        Scene scene = new Scene(topMenu);
        scene.getStylesheets().add("style.css");
        scene.getStylesheets().add("label.css");

        //showing scene
        primary.setScene(scene);

        //making the size
        primary.setHeight(700);
        primary.setWidth(400);

        //show scene
        primary.setTitle("Instagram Prototype");
        primary.show();

        
    }
}
