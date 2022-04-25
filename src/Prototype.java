import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.EventHandler;

public class Prototype extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    // bottom bar
    Button home = new Button();
    Button explore = new Button();
    Button reels = new Button();
    Button activity = new Button();
    Button profile = new Button();

    HBox bottom = new HBox(50, home, explore, reels, activity, profile);

    @Override
    public void start(Stage primary) throws Exception {

        Image homeImage = new Image("home.jpg");
        ImageView homeView = new ImageView(homeImage);
        homeView.setFitHeight(25);
        homeView.setFitWidth(25);

        home.setPrefSize(25, 25);
        home.setGraphic(homeView);

        Image exploreImage = new Image("explore.jpg");
        ImageView exploreView = new ImageView(exploreImage);
        exploreView.setFitHeight(25);
        exploreView.setFitWidth(25);

        explore.setPrefSize(25, 25);
        explore.setGraphic(exploreView);

        Image reelsImage = new Image("reels.jpg");
        ImageView reelsView = new ImageView(reelsImage);
        reelsView.setFitHeight(25);
        reelsView.setFitWidth(25);

        reels.setPrefSize(25, 25);
        reels.setGraphic(reelsView);

        Image activiyImage = new Image("activity.jpg");
        ImageView activityView = new ImageView(activiyImage);
        activityView.setFitHeight(25);
        activityView.setFitWidth(25);

        activity.setPrefSize(25, 25);
        activity.setGraphic(activityView);

        Image profileImages = new Image("profile.jpg");
        ImageView profileVI = new ImageView(profileImages);
        profileVI.setFitHeight(25);
        profileVI.setFitWidth(25);

        profile.setPrefSize(25, 25);
        profile.setGraphic(profileVI);

        // scene
        // for top right
        Label insta = new Label("Instagram");

        // image for add.jpg
        Image createImage = new Image("post.jpg");
        ImageView createView = new ImageView(createImage);
        createView.setFitHeight(25);
        createView.setFitWidth(25);

        // image for activity.jpg
        Image shopImage = new Image("shop.jpg");
        ImageView shopView = new ImageView(shopImage);
        shopView.setFitHeight(25);
        shopView.setFitWidth(25);

        // image for activity.jpg
        Image dmsImage = new Image("dm.jpg");
        ImageView dmsView = new ImageView(dmsImage);
        dmsView.setFitHeight(30);
        dmsView.setFitWidth(30);

        // to be changed, just for set up rn
        Button create = new Button();
        Button shop = new Button();
        Button dms = new Button();

        // prefered sizes for create button
        create.setPrefSize(25, 25);
        create.setGraphic(createView);

        // prefered sizes for activity button
        shop.setPrefSize(25, 25);
        shop.setGraphic(shopView);

        // prefered sizes for activity button
        dms.setPrefSize(30, 30);
        dms.setGraphic(dmsView);

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

        // image for like.jpg
        Image likeImage = new Image("like.jpg");
        ImageView likeView = new ImageView(likeImage);
        likeView.setFitHeight(25);
        likeView.setFitWidth(25);

        Image commentImage = new Image("comment.jpg");
        ImageView commentView = new ImageView(commentImage);
        commentView.setFitHeight(25);
        commentView.setFitWidth(25);

        Image sendImage = new Image("send.jpg");
        ImageView sendView = new ImageView(sendImage);
        sendView.setFitHeight(25);
        sendView.setFitWidth(25);

        Image saveImage = new Image("save.jpg");
        ImageView saveView = new ImageView(saveImage);
        saveView.setFitHeight(25);
        saveView.setFitWidth(25);

        // like bar
        Button like = new Button();
        Button comment = new Button();
        Button send = new Button();
        Button save = new Button();

        // prefered sizes for create button
        like.setPrefSize(25, 25);
        like.setGraphic(likeView);

        // prefered sizes for create button
        comment.setPrefSize(25, 25);
        comment.setGraphic(commentView);

        // prefered sizes for create button
        send.setPrefSize(25, 25);
        send.setGraphic(sendView);

        // prefered sizes for create button
        save.setPrefSize(25, 25);
        save.setGraphic(saveView);

        // scene2 activity
        shop.setOnAction(event -> {
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

        HBox topButtons = new HBox(10, create, shop, dms);
        // need to set paddings
        HBox topMenu = new HBox(200, insta, topButtons);

        HBox posterInfo = new HBox(10, profilePiciv, poster);
        HBox postOpt = new HBox(250, posterInfo, postOptions);

        HBox post = new HBox(post1iv);
        post.setAlignment(Pos.CENTER);

        HBox likeBtns = new HBox(like, comment, send);
        HBox likeBar = new HBox(200, likeBtns, save);

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

        activity.setOnAction(event -> {
            Label title = new Label("Activity");

            // back button
            Button backButton = new Button("Back");
            backButton.setPrefSize(50, 50);

            Image likedPosts = new Image("likedposts.jpg");
            ImageView likedPostsIV = new ImageView(likedPosts);

            likedPostsIV.setFitWidth(750);
            likedPostsIV.setFitHeight(700);
            likedPostsIV.setPreserveRatio(true);

            Image commentOption = new Image("commentact.jpg");
            ImageView commentOptionIV = new ImageView(commentOption);

            commentOptionIV.setFitWidth(700);
            commentOptionIV.setFitHeight(700);
            commentOptionIV.setPreserveRatio(true);

            Image followersOption = new Image("followersact.jpg");
            ImageView followersOptionIV = new ImageView(followersOption);

            followersOptionIV.setFitWidth(400);
            followersOptionIV.setFitHeight(500);
            followersOptionIV.setPreserveRatio(true);

            Image tagged = new Image("taggedact.jpg");
            ImageView taggedIV = new ImageView(tagged);

            taggedIV.setFitWidth(400);
            taggedIV.setFitHeight(500);
            taggedIV.setPreserveRatio(true);

            Button likeOption = new Button("Likes");
            Button commentButtn = new Button("Comments");
            Button followingOption = new Button("Follows");
            Button taggedOption = new Button("Tagged");

            VBox vBox = new VBox(title, likeOption, commentButtn, followingOption, taggedOption, home);

            likeOption.setOnAction(event2 -> {

                HBox hboxliked = new HBox(likedPostsIV);
                hboxliked.setAlignment(Pos.CENTER_LEFT);
                VBox back = new VBox(activity, hboxliked);
                Scene scene3 = new Scene(back);
                primary.setScene(scene3);

            });

            commentButtn.setOnAction(event2 -> {
                HBox hboxcomment = new HBox(commentOptionIV);
                hboxcomment.setAlignment(Pos.CENTER_LEFT);
                VBox back = new VBox(activity, hboxcomment);
                Scene scene3 = new Scene(back);
                primary.setScene(scene3);

            });

            followingOption.setOnAction(event2 -> {
                HBox hboxfollower = new HBox(followersOptionIV);
                hboxfollower.setAlignment(Pos.CENTER_LEFT);
                VBox back = new VBox(activity, hboxfollower);
                Scene scene3 = new Scene(back);
                primary.setScene(scene3);

            });
            taggedOption.setOnAction(event2 -> {
                HBox hboxtagged = new HBox(taggedIV);
                hboxtagged.setAlignment(Pos.CENTER_LEFT);
                VBox back = new VBox(activity, hboxtagged);
                Scene scene3 = new Scene(back);
                primary.setScene(scene3);

            });

            // Create a Scene.
            Scene scene2 = new Scene(vBox);

            // Add the Scene to the Stage.
            primary.setScene(scene2);

            // Set the stage title.
            primary.setTitle("Activity");

            // Show the window.

            primary.show();
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
        Image recommendedFollowers = new Image("recommended.png");
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

        VBox profilePage = new VBox(10, profileTop, name, bio, editProfile);

        VBox profileWholePage = new VBox(400, profilePage, bottom);

        addFollowers.setOnAction(event -> {
            recFollowers.setImage(recommendedFollowers);
        });

        home.setOnAction(event -> {
            primary.setScene(homeScene);
        });

        Scene scene3 = new Scene(profileWholePage);

        return scene3;
    }
}