package org.ui;

import javafx.application.Application;
import javafx.stage.Stage;

public class UiStarter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Music Player");
        primaryStage.show();
    }
}
