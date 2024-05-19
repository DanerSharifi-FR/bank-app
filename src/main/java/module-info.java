module com.bank.bankapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires ojdbc10.g;


    opens com.bank.bankapp to javafx.fxml;
    exports com.bank.bankapp;
    exports com.bank.bankapp.Controllers;
    exports com.bank.bankapp.Models;
    exports com.bank.bankapp.Views;
}