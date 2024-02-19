package me.nvm.MainApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("MainWindow-view.fxml"));

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);



        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}