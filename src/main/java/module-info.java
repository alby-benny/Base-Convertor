module com.example.baseconvertor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.baseconvertor to javafx.fxml;
    exports com.example.baseconvertor;
}