package com;

import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Main
 */
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // root node
            HBox root = new HBox();
            // setup root node
            root.setPrefSize(340, 70);
            root.setSpacing(10);
            root.setAlignment(Pos.CENTER);

            // node elements
            Button button1 = new Button();
            Button button2 = new Button();
            Button button3 = new Button();
            Button button4 = new Button();

            TextField textField = new TextField();


            // setup node elements
            button1.setPrefSize(64, 64);
            button2.setPrefSize(64, 64);
            button3.setPrefSize(64, 64);
            button4.setPrefSize(64, 64);

            button1.getStyleClass().add("button1");
            button2.getStyleClass().add("button2");
            button3.getStyleClass().add("button3");
            button4.getStyleClass().add("button4");


            // add elements to root
            root.getChildren().add(textField);
            root.getChildren().add(button1);
            root.getChildren().add(button2);
            root.getChildren().add(button3);
            root.getChildren().add(button4);


            // event handling
            button1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    getHostServices().showDocument("http://www.youtube.com");
                };
            });
            button2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    getHostServices().showDocument("http://www.facebook.com");
                };
            });

            button3.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    getHostServices().showDocument("http://www.twitter.com");
                };
            });

            button4.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    primaryStage.close();
                };
            });



            // scene setup
            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            System.out.println("path: " + scene.getStylesheets());
            primaryStage.setTitle("JavaFX Exercise");
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}