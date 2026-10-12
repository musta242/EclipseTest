package Altklausur2026;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class wiederholen extends Application {
	public static void main(String[]args) {
		launch(args);
	}
	public void start(Stage s) {
		TextField text = new TextField();
		RadioButton r1 = new RadioButton("Kleinbuchstaben");
		RadioButton r2 = new RadioButton("Überprüfung");
		Button b = new Button();
		Label l = new Label();
		HBox box = new HBox(text,r1,r2,b,l);
		box.setAlignment(Pos.CENTER);
		BorderPane bp = new BorderPane();
		bp.setCenter(box);
		b.setDefaultButton(true);
		ToggleGroup group = new ToggleGroup();
		r1.setToggleGroup(group);
		r2.setToggleGroup(group);
		r1.setSelected(true);
		b.setOnAction(e->{
			if(r1.isSelected()) {
				String eingabe = text.getText();
				text.setText(eingabe.toLowerCase());
			}
			if(r2.isSelected()) {
				String eingabe = text.getText();
				if(eingabe.matches("SER-[A-Z]{3,5}\\d{4}")) {
					l.setText("Korrekt");
				}
				else {
					l.setText("Nicht korrekt");
				}
			}
		});
		Scene sc = new Scene(bp,600,900);
		s.setScene(sc);
		s.show();
	}
}
