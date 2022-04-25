import javafx.application.Application;
import javafx.event.Event;
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

public class Prototype extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    // bottom bar
    Button home = new Button("[^]");
    Button explore = new Button("-o");
    Button reels = new Button("[>]");
    Button shop = new Button("$$");
    Button profile = new Button(">‿<");

    HBox bottom = new HBox(50, home, explore, reels, shop, profile);

    @Override
    public void start(Stage primary) throws Exception {

        // scene
        // for top right
        Label insta = new Label("Instagram");

        // to be changed, just for set up rn
        Button create = new Button("+");
        Button activity = new Button("<3");
        Button dms = new Button(">");

        // Post
        // poster info
        Image profilePic = new Image("billyProfilePic.jpg");
        ImageView profilePiciv = new ImageView(profilePic);
        Label poster = new Label("billy.cpp");
        Button postOptions = new Button("...");

        // image
        Image post1 = new Image("billy.jpg");
        Image post2 = new Image("billythebronco.jpg");

        ImageView post1iv = new ImageView(post1);
        ImageView post2iv = new ImageView(post2);

        // like bar
        Button like = new Button("<3");
        Button comment = new Button("<()");
        Button send = new Button(">");
        Button save = new Button("[]");

        // scene2 activity
        activity.setOnAction(event -> {
            Label hi = new Label("scene2");

            // setting a new page
            Scene scene2 = new Scene(hi);

            primary.setScene(scene2);
        });

        // scene4 reels
        // scene5 reel full

        // scene

        // set poster info
        profilePiciv.setFitWidth(50);
        profilePiciv.setFitHeight(50);
        profilePiciv.setPreserveRatio(true);

        // set padding
        post1iv.setFitWidth(350);
        post1iv.setFitHeight(350);
        post1iv.setPreserveRatio(true);

        HBox topButtons = new HBox(10, create, activity, dms);
        // need to set paddings
        HBox topMenu = new HBox(215, insta, topButtons);

        HBox posterInfo = new HBox(10, profilePiciv, poster);
        HBox postOpt = new HBox(250, posterInfo, postOptions);

        HBox post = new HBox(post1iv);
        post.setAlignment(Pos.CENTER);

        HBox likeBtns = new HBox(like, comment, send);
        HBox likeBar = new HBox(250, likeBtns, save);

        GridPane feed = new GridPane();

        bottom.setAlignment(Pos.BOTTOM_CENTER);

        feed.add(topMenu, 0, 0);
        feed.add(postOpt, 0, 1);
        feed.add(post, 0, 2);
        feed.add(likeBar, 0, 3);

        VBox homeScreen = new VBox(175, feed, bottom);

        // for setting scene
        Scene scene = new Scene(homeScreen);
        scene.getStylesheets().add("style.css");
        scene.getStylesheets().add("labels.css");
        insta.getStyleClass().add("insta");

        // showing scene
        primary.setScene(scene);

        // scene3 profile
        profile.setOnAction(event -> {
            Scene scene3 = setSecene3(primary, scene);

            primary.setScene(scene3);
        });

        // making the size
        primary.setHeight(700);
        primary.setWidth(400);

        // show scene
        primary.setTitle("Instagram Prototype");
        primary.show();

    }

    private Scene setSecene3(Stage primary, Scene homeScene) {
        Image addPeopleIcon = new Image("addPeople.png");
        ImageView addIcon = new ImageView(addPeopleIcon);
        Image recommendedFollowers = new Image("recomended.png");
        ImageView recFollowers = new ImageView();

        recFollowers.setFitWidth(400);
        recFollowers.setFitHeight(250);
        recFollowers.setPreserveRatio(true);

        Image profilePic = new Image("billyProfilePic.jpg");
        ImageView profilePiciv = new ImageView(profilePic);

        Button postCount = new Button("45");
        Button followerCount = new Button("32");
        Button followingCount = new Button("33");

        Label posts = new Label("Posts");
        Label followers = new Label("Followers");
        Label Following = new Label("Following");

        Button editProfile = new Button("Edit Profile");

        Button addFollowers = new Button("+(O)");

        Label name = new Label("Billy the Bronco");
        Label bio = new Label("Est. 1938");

        name.setAlignment(Pos.CENTER_LEFT);
        bio.setAlignment(Pos.CENTER_LEFT);

        profilePiciv.setFitWidth(50);
        profilePiciv.setFitHeight(50);
        profilePiciv.setPreserveRatio(true);

        HBox followersandadd = new HBox(followers, addFollowers);

        GridPane profile = new GridPane();
        profile.setHgap(20);
        profile.setVgap(10);
        profile.add(postCount, 0, 0);
        profile.add(followerCount, 1, 0);
        profile.add(followingCount, 2, 0);
        profile.add(posts, 0, 1);
        profile.add(followersandadd, 1, 1);
        profile.add(Following, 2, 1);

        HBox profileTop = new HBox(50, profilePiciv, profile);
        profileTop.setAlignment(Pos.TOP_LEFT);

        VBox profilePage = new VBox(10, profileTop, recFollowers, name, bio, editProfile);

        VBox profileWholePage = new VBox(400, profilePage, bottom);

        addFollowers.setOnAction(event ->{
            recFollowers.setImage(recommendedFollowers);
        });

        home.setOnAction(event ->{
            primary.setScene(homeScene);
        });

        Scene scene3 = new Scene(profileWholePage);

        return scene3;
    }
}
