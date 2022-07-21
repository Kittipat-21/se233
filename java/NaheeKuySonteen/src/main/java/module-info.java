module com.example.naheekuysonteen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.naheekuysonteen to javafx.fxml;
    exports com.example.naheekuysonteen;
}