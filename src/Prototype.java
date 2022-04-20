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


        //Post
        //poster info
        Image profilePic = new Image("billyProfilePic.jpg");
        ImageView profilePiciv = new ImageView(profilePic);
        Label poster = new Label("billy.cpp");
        Button postOptions = new Button("...");
        profilePiciv.setFitWidth(50);
        profilePiciv.setFitHeight(50);
        profilePiciv.setPreserveRatio(true);

        HBox posterInfo = new HBox(10, profilePiciv, poster);
        HBox postOpt = new HBox(250, posterInfo, postOptions);


        //image
        Image post1 = new Image("billy.jpg");
        Image post2 = new Image("billythebronco.jpg");

        ImageView post1iv = new ImageView(post1);
        ImageView post2iv = new ImageView(post2);

        //set padding
        post1iv.setFitWidth(350);
        post1iv.setFitHeight(350);
        post1iv.setPreserveRatio(true);

        HBox post = new HBox(post1iv);
        post.setAlignment(Pos.CENTER);

        //like bar
        Button like = new Button("<3");
        Button comment = new Button("<()");
        Button send = new Button(">");
        Button save = new Button("[]");

        HBox likeBtns = new HBox(like, comment, send);
        HBox likeBar = new HBox(275, likeBtns, save);


        GridPane feed = new GridPane();

        feed.add(topMenu, 0, 0);
        feed.add(postOpt, 0, 1);
        feed.add(post, 0, 2);
        feed.add(likeBar, 0, 3);




        //for setting scene
        Scene scene = new Scene(feed);
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
