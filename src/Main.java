
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane; 
import javafx.stage.Stage; 
  
public class Main extends Application { 
  
	@Override 
	public void start(Stage primaryStage) throws Exception { 
		final Pane root = new Pane(); 
		final Scene scene = new Scene(root, 300, 250); 
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		root.getChildren().add(btn);
		primaryStage.setTitle("IHM-2018"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	} 
  
	public static void main(String... args) { 
		Application.launch(args); 
	} 
}