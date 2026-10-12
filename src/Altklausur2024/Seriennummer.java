package Altklausur2024;

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

public class Seriennummer extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage s)  {
		TextField text = new TextField();
		RadioButton r1 = new RadioButton("Kleinbuchstaben");
		Button b = new Button();
		RadioButton r2 = new RadioButton("Überprüfung");
		ToggleGroup group = new ToggleGroup();
		r1.setToggleGroup(group);
		r2.setToggleGroup(group);
		r1.setSelected(true);
		Label l = new Label();
		HBox h = new HBox(text, r1,r2,b,l);
		h.setAlignment(Pos.CENTER);
		BorderPane bp = new BorderPane();
		bp.setCenter(h);
		b.setDefaultButton(true);
		
		b.setOnAction(e->{
			if(r1.isSelected()) {
				String eingabe = text.getText();
				text.setText(eingabe.toUpperCase());
			}
			if(r2.isSelected()) {
				System.out.println("Eingabe: '" + text.getText() + "'");
				System.out.println("Matches: " + text.getText().matches("SER-[A-Z]{3,5}\\d{4}"));
					String eingabe = text.getText();
					if(eingabe.matches("SER-[A-Z]{3,5}\\d{4}")){
					l.setText("KORREKT");
					}
					else {
					l.setText("NICHT KORREKT");
					}
			}
		});
		Scene sc = new Scene(bp, 600, 400);
		s.setScene(sc);
		s.show();
	}
}
