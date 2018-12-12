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

public class atelier_debutant_controller {
	@FXML
	private Button btn_aide1;

	@FXML
	private Button btn_aide2;

	@FXML
	private Button btn_exo1lecon1;

	@FXML
	private Button btn_exo1lecon2;

	@FXML
	private Button btn_exo2lecon1;

	@FXML
	private Button btn_exo2lecon2;

	@FXML
	private void handleAide1Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs fa�on, mais ils ne vont forc�ment pas le dire de la m�me fa�on , cela sera souvent en fonction de l'heure de la journ�e."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'apr�s-midi (afternoon) ils vont associer le temps en le faisant pr�c�der par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilis� pour r�pondre au t�l�phone (comme Allo en France) ou dire \"Salut\" et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleAide2Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs fa�on, mais ils ne vont forc�ment pas le dire de la m�me fa�on , cela sera souvent en fonction de l'heure de la journ�e."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'apr�s-midi (afternoon) ils vont associer le temps en le faisant pr�c�der par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilis� pour r�pondre au t�l�phone (comme Allo en France) et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleExercice1Lecon1Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs fa�on, mais ils ne vont forc�ment pas le dire de la m�me fa�on , cela sera souvent en fonction de l'heure de la journ�e."
				   + "\nDe ce fait si c'est le matin (morning) ou l'apr�s-midi (afternoon) ils vont associer le temps en le faisant pr�c�der par Good (bon) donnant:"
				   + "\n\n"
				   + "Good Morning"
				   + "\n"
				   + "Good Afternoon"
				   + "\n\n"
				   + "Hello est surtout utilis� pour r�pondre au t�l�phone (comme Allo en France) ou dire \"Salut\" et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleExercice1Lecon2Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("");
        alert.showAndWait();
	}

	@FXML
	private void handleExercice2Lecon1Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs fa�on, mais ils ne vont forc�ment pas le dire de la m�me fa�on , cela sera souvent en fonction de l'heure de la journ�e."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'apr�s-midi (afternoon) ils vont associer le temps en le faisant pr�c�der par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilis� pour r�pondre au t�l�phone (comme Allo en France) et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleExercice2Lecon2Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("");
        alert.showAndWait();
	}
}
