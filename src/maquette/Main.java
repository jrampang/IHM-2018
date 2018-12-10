package maquette;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setResizable(false);
        this.primaryStage.setTitle("Maquette IHM-2018-Langage");

        initRootLayout();

        //Open lexique_dictionnaire layout
        //Must be call on a button event on the future
        //in the Lexicon tab
        
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/root.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the Lexicon dictionary in a new layout.
     */
    public void show_lexique_dictionnary() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("../view/lexique_dictionnaire.fxml"));
            AnchorPane lexique_dictionnary = (AnchorPane) loader.load();

        	// Show the scene containing the layout.
            Scene scene = new Scene(lexique_dictionnary);
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
            loader.setLocation(Main.class.getResource("../view/lexique_expression.fxml"));
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
            loader.setLocation(Main.class.getResource("../view/lexique_phrase.fxml"));
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
            loader.setLocation(Main.class.getResource("../view/atelier_debutant.fxml"));
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
            loader.setLocation(Main.class.getResource("../view/atelier_intermediaire.fxml"));
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
            loader.setLocation(Main.class.getResource("../view/atelier_maitrise.fxml"));
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
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}