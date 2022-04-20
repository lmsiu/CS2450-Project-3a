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
        
        //scene
        //for top right
        Label insta = new Label("Instagram");
        //to be changed, just for set up rn
        Button create = new Button("+");
        Button activity = new Button("<3");
        Button dms = new Button(">");

        //Post
        //poster info
        Image profilePic = new Image("billyProfilePic.jpg");
        ImageView profilePiciv = new ImageView(profilePic);
        Label poster = new Label("billy.cpp");
        Button postOptions = new Button("...");

        //image
        Image post1 = new Image("billy.jpg");
        Image post2 = new Image("billythebronco.jpg");

        ImageView post1iv = new ImageView(post1);
        ImageView post2iv = new ImageView(post2);

        //like bar
        Button like = new Button("<3");
        Button comment = new Button("<()");
        Button send = new Button(">");
        Button save = new Button("[]");

        //bottom bar
        Button home = new Button("[^]");
        Button explore = new Button("-o");
        Button reels = new Button("[>]");
        Button shop = new Button("$$");
        Button profile = new Button(">‿<");

        //scene2 activity
        activity.setOnAction(event -> {
            Label hi = new Label("scene2");

            //setting a new page
            Scene scene2 = new Scene(hi);

            primary.setScene(scene2);
        });

        //scene3 profile
        profile.setOnAction(event ->{
            Scene scene3 = setSecene3();

            primary.setScene(scene3);
        });

        //scene4 reels
        //scene5 reel full

        //scene
    
        //set poster info
        profilePiciv.setFitWidth(50);
        profilePiciv.setFitHeight(50);
        profilePiciv.setPreserveRatio(true);

        //set padding
        post1iv.setFitWidth(350);
        post1iv.setFitHeight(350);
        post1iv.setPreserveRatio(true);

        HBox topButtons = new HBox(10, create, activity, dms);
    //need to set paddings
        HBox topMenu = new HBox(215, insta, topButtons);

        HBox posterInfo = new HBox(10, profilePiciv, poster);
        HBox postOpt = new HBox(250, posterInfo, postOptions);

        HBox post = new HBox(post1iv);
        post.setAlignment(Pos.CENTER);

        HBox likeBtns = new HBox(like, comment, send);
        HBox likeBar = new HBox(250, likeBtns, save);

        GridPane feed = new GridPane();

        HBox bottom = new HBox(50, home, explore, reels, shop, profile);
        bottom.setAlignment(Pos.BOTTOM_CENTER);

        feed.add(topMenu, 0, 0);
        feed.add(postOpt, 0, 1);
        feed.add(post, 0, 2);
        feed.add(likeBar, 0, 3);

        VBox homeScreen = new VBox(175, feed, bottom);

        //for setting scene
        Scene scene = new Scene(homeScreen);
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

    private Scene setSecene3(){
        Image addPeopleIcon = new Image("addPeople.png");
        ImageView addIcon = new ImageView(addPeopleIcon);
        
        Button postCount = new Button("45");
        Button followerCount = new Button("32");
        Button followingCount = new Button("33");

        Button editProfile = new Button("Edit Profile");

        Button addFollowers = new Button("+>_<");

        Label name = new Label("Billy the Bronco");
        Label bio = new Label("Est. 1938");


        Scene scene3 = new Scene(name);

        return scene3;
    }
}
