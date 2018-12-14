package maquette.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class atelier_maitrise_controller {
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
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs façon, mais ils ne vont forcément pas le dire de la même façon , cela sera souvent en fonction de l'heure de la journée."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'après-midi (afternoon) ils vont associer le temps en le faisant précéder par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilisé pour répondre au téléphone (comme Allo en France) ou dire \"Salut\" et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleAide2Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs façon, mais ils ne vont forcément pas le dire de la même façon , cela sera souvent en fonction de l'heure de la journée."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'après-midi (afternoon) ils vont associer le temps en le faisant précéder par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilisé pour répondre au téléphone (comme Allo en France) et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
        alert.showAndWait();
	}

	@FXML
	private void handleExercice1Lecon1Button(){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs façon, mais ils ne vont forcément pas le dire de la même façon , cela sera souvent en fonction de l'heure de la journée."
				   + "\nDe ce fait si c'est le matin (morning) ou l'après-midi (afternoon) ils vont associer le temps en le faisant précéder par Good (bon) donnant:"
				   + "\n\n"
				   + "Good Morning"
				   + "\n"
				   + "Good Afternoon"
				   + "\n\n"
				   + "Hello est surtout utilisé pour répondre au téléphone (comme Allo en France) ou dire \"Salut\" et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
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
        alert.setContentText("Les anglais disent \"Bonjour\" de plusieurs façon, mais ils ne vont forcément pas le dire de la même façon , cela sera souvent en fonction de l'heure de la journée."
        				   + "\nDe ce fait si c'est le matin (morning) ou l'après-midi (afternoon) ils vont associer le temps en le faisant précéder par Good (bon) donnant:"
        				   + "\n\n"
        				   + "Good Morning"
        				   + "\n"
        				   + "Good Afternoon"
        				   + "\n\n"
        				   + "Hello est surtout utilisé pour répondre au téléphone (comme Allo en France) et Welcome pour accueillir une ou plusieurs personne(s) (comme avec \"Bienvenue\")");
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
