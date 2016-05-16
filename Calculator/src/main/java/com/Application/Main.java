package com.Application;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
	Menu view=new Menu("View");
	MenuItem scient =new MenuItem("Scientific");
	MenuItem standard =new MenuItem("Standard");
	Standard stan = new Standard();
	VBox root=new VBox();
	VBox root1=new VBox();
	VBox root2=new VBox();
	Scientific scien = new Scientific();
    Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
    @Override
    public void start(Stage stage) {

		view.getItems().addAll(standard,scient);
		MenuBar m=new MenuBar();
 		m.getMenus().add(view);
		root.getChildren().addAll(m,stan);
			scient.setOnAction(e->{
				
				root2.getChildren().addAll(m,scien);
 			stage.setScene(new Scene(root2,375,300));
 		});
			standard.setOnAction(e->{
 				root1.getChildren().addAll(m,stan);
	 			stage.setScene(new Scene(root1,250,300));
	 		});
		root.setId("pane");
        Scene scene = new Scene(root,250,300);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("/icon.png")));
        stage.setScene(scene);
        stage.show();
    }
}
