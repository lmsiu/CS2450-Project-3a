import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Prototype extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primary) throws Exception {
        
        //for top right
        Label insta = new Label("Instagram");
        //to be changed, just for set up rn
        Button create = new Button("+");
        Button activity = new Button("<3");
        Button dms = new Button(">");

        HBox topButtons = new HBox(10, create, activity, dms);
    //need to set paddings
        HBox topMenu = new HBox(215, insta, topButtons);

        //Image post = new Image();



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
