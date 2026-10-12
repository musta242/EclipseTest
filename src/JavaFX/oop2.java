package JavaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class oop2 extends Application{
		@Override
		public void start(Stage Stage) {
			new AnwendungssystemControl(Stage);
		}
		
	public static void main(String[]args) {
		launch(args);
	}
}
