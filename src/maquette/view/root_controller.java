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

public class root_controller {
	@FXML
	private Button btn_quitter_accueil;
	
	@FXML
	private Button btn_quitter_lexique;
	
	@FXML
	private Button btn_quitter_decouverte;

	@FXML
	private Button btn_quitter_ateliers;
	
	@FXML
	private Button btn_aide_accueil;
	
	@FXML
	private Button btn_aide_lexique;
	
	@FXML
	private Button btn_aide_decouverte;

	@FXML
	private Button btn_aide_ateliers;
    
	@FXML
	private Button btn_show_lexique_dictionnaire;
	
	@FXML
	private Button btn_show_lexique_expression;

	@FXML
	private Button btn_show_lexique_phrase;
	
	@FXML
	private Button btn_show_atelier_debutant;
	
	@FXML
	private Button btn_show_atelier_intermediaire;
	
	@FXML
	private Button btn_show_atelier_maitrise;
	
	@FXML
	private void handleQuitterButton (){
		//System.out.println("Accueil: Quitter");
		Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Attention");
        alert.setHeaderText("Vous allez quitter l'application");

        alert.showAndWait();
	}
	
	@FXML
	private void handleAideButton (){
		//System.out.println("Accueil: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Utiliser les onglets Accueil, Lexique, Découvertes et Ateliers pour naviguer dans l'application");
        alert.showAndWait();
	}
	
	@FXML
	private void handleLexiqueAideButton (){
		//System.out.println("Lexique: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Utiliser les boutons pour ouvrir les différents dictionnaires des mots, des phrases utiles tout les jours ou celui des expressions." + "\n\n" + "Vous pouvez aussi rentrer au clavier dans la zone de saisie à gauche un mot dont vous chercher la signification, sa traduction vous sera renseigné dans la zone à droite, vous pouvez aussi saisir un mot inconnu à droite et son équivalent s'affiche dans la zone à gauche.");
        alert.showAndWait();
	}
	
	@FXML
	private void handleDecouvertesAideButton (){
		//System.out.println("Decouvertes: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Utiliser les boutons pour ouvrir les différents magazines proposés.\n\nLes magazines sont nivelés en fonction d'un niveau de connaissance théoriquement requis pour comprendre leur sujet.");
        alert.showAndWait();
	}
	
	@FXML
	private void handleAteliersAideButton (){
		//System.out.println("Ateliers: Aide");
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.getDialogPane().setMinSize(400, 300);
        alert.setTitle("Aide");
        alert.setHeaderText(null);
        alert.setContentText("Utiliser les boutons pour ouvrir les différentes série d'exercices nivelées en fonction d'un niveau de connaissance théoriquement requis pour les réussir ");
        alert.showAndWait();
	}
	
	/**
     * Shows the Lexicon dictionary in a new layout.
     */
	@FXML
    public void show_lexique_dictionnary() {
        try {
            // Load
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/lexique_dictionnaire.fxml"));
            AnchorPane lexicon_dictionnary = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(lexicon_dictionnary);
            Stage lexique_dictionnary_stage = new Stage();
            lexique_dictionnary_stage.setResizable(false);
            lexique_dictionnary_stage.setTitle("Dictionnaire");
            lexique_dictionnary_stage.setScene(scene);
            lexique_dictionnary_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	/**
     * Shows the Lexicon expressions in a new layout.
     */
    public void show_lexique_expression() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/lexique_expression.fxml"));
            AnchorPane lexique_expression = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(lexique_expression);
            Stage lexique_expression_stage = new Stage();
            lexique_expression_stage.setTitle("Expressions");
            lexique_expression_stage.setScene(scene);
            lexique_expression_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the Lexicon phrases in a new layout.
     */
    public void show_lexique_phrase() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/lexique_phrase.fxml"));
            AnchorPane lexique_phrase = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(lexique_phrase);
            Stage lexique_phrase_stage = new Stage();
            lexique_phrase_stage.setTitle("Phrases");
            lexique_phrase_stage.setScene(scene);
            lexique_phrase_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Shows the Atelier for beginner in a new layout.
     */
    public void show_atelier_debutant() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/atelier_debutant.fxml"));
            AnchorPane atelier_debutant = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(atelier_debutant);
            Stage atelier_debutant_stage = new Stage();
            atelier_debutant_stage.setTitle("Exercice niveau d�butant");
            atelier_debutant_stage.setScene(scene);
            atelier_debutant_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the Atelier for intermediate level in a new layout.
     */
    public void show_atelier_intermediaire() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/atelier_intermediaire.fxml"));
            AnchorPane atelier_intermediaire = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(atelier_intermediaire);
            Stage atelier_intermediaire_stage = new Stage();
            atelier_intermediaire_stage.setTitle("Exercice niveau interm�diaire");
            atelier_intermediaire_stage.setScene(scene);
            atelier_intermediaire_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the Atelier for master level in a new layout.
     */
    public void show_atelier_maitrise() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/atelier_maitrise.fxml"));
            AnchorPane atelier_maitrise = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(atelier_maitrise);
            Stage atelier_maitrise_stage = new Stage();
            atelier_maitrise_stage.setTitle("Exercice niveau maitrise");
            atelier_maitrise_stage.setScene(scene);
            atelier_maitrise_stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
