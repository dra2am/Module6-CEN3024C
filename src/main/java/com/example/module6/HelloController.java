package com.example.module6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * <h1>Contains JavaFX code</h1>
 *
 * This class is responsible for setting the text in the javafx console once a button is clicked!
 *
 *
 * @author Diana Alcantara
 * @since 2021-11-18
 */

public class HelloController {
    /**
     * The text that will be edited in onClick
     */
    @FXML
    private Label welcomeText;

    /**
     * when clicked, button will setText to "Look at the Console"
     */
    @FXML
    protected void onClick() throws IOException {
        ReadWebPage reader = new ReadWebPage();
        reader.topWords();
        welcomeText.setText("Look at the Console!");
    }
}