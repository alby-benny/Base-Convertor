package com.example.baseconvertor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class BaseConvertor extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BaseConvertor.class.getResource("convertor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Base Convertor");
        stage.setScene(scene);
        stage.show();
        stage.setWidth(360);
        stage.setHeight(400);
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}