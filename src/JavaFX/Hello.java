package JavaFX;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;

public class Hello extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage stage) throws Exception {
		Label hello = new Label("Hallo JavaFX");
		
		Scene scene =  new Scene(hello);
		stage.setScene(scene);
		stage.show();
	}

}
