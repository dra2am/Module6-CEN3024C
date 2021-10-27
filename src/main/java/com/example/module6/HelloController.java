package com.example.module6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onClick() throws IOException {
        ReadWebPage reader = new ReadWebPage();
        reader.topWords();
        welcomeText.setText("Look at the Console!");
    }
}