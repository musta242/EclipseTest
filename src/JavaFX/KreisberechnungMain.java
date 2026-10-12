package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class KreisberechnungMain extends Application {
	public void start(Stage s) throws Exception {
		s.setTitle("Kreisberechnung");
		Button umfang = new Button("Umfang berechnen");
		Button fläche = new Button("Fläche berechnen");
		fläche.setDisable(true); // ausgegraut
		
		umfang.setOnAction(e ->{
			UmfangFenster umfangfenster = new UmfangFenster();
			try {
				umfangfenster.show();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		FlowPane layout = new FlowPane(10,10);
		layout.getChildren().addAll(umfang,fläche);
		
		Scene scene = new Scene(layout,300,100);
		s.setScene(scene);
		s.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
