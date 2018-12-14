package maquette.view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import maquette.Main;
import javafx.scene.control.Button;

public class lexique_controller {
	@FXML
	private Button btn_quitter;
	
	@FXML
	private void handleAideButton() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Vous pouvez utiliser les colonnes Alphabétique et Thème pour choisir/ trier à droite.");
        alert.showAndWait();
	}
	
	@FXML
	private void handleQuitterButton (){
		// get a handle to the stage
	    Stage stage = (Stage) btn_quitter.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
}