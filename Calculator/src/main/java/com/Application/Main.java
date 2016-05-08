package com.Application;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
    	Design root =new Design ();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/icon.png")));
        stage.setScene(scene);
        stage.show();
    }
}
