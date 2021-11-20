package com.example.module6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * <h1>Runs Program</h1>
 *
 *This class contains the main class that runs the entire program.
 * It also contains the code to create the javafx text box that appears when the program is run.
 *
 * @author Diana Alcantara
 * @since 2021-11-18
 */

public class HelloApplication extends Application {
    /**
     * Method responsible for set up of JavaFx
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Word Occurrences App");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method - runs program
     */
    public static void main(String[] args) {
        launch();
    }
}