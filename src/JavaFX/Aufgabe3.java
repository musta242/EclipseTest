package JavaFX;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.*;
import javafx.application.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class Aufgabe3 extends Application {
	@Override
	public void start(Stage s) {
		TextField textfeld = new TextField();
		Button buttonlänge = new Button("Textlänge");
		Button buttonreverse = new Button("TextReverse");
		Label label = new Label("Ausgabe hier");
		FlowPane fp = new FlowPane();
	}
}
