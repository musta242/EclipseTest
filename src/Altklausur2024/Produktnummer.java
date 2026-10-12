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

public class Produktnummer extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage s) {
		TextField text = new TextField();
		RadioButton r1 = new RadioButton("Großbuchstabe");
		RadioButton r2 = new RadioButton("Überprüfung");
		Button b = new Button();
		ToggleGroup group = new ToggleGroup();
		r1.setToggleGroup(group);
		r2.setToggleGroup(group);
		Label l = new Label();
		HBox box = new HBox(text, r1, r2,b,l);
		box.setAlignment(Pos.CENTER);
		BorderPane bp = new BorderPane();
		bp.setCenter(box);
		r1.setSelected(true);
		
		b.setOnAction(e->{
			if(r1.isSelected()== true) {
				String zeichenkette = text.getText();
				text.setText(zeichenkette.toUpperCase());
			}
			if(r2.isSelected() == true) {
				String zeichenkette = text.getText();
				if(zeichenkette.matches("PRO\\d{4}-[A-Z]{3,5}")) {
					l.setText("Korrekt");
				}
				else {
					l.setText("nicht korrekt");
				}
			}
		});
		Scene sc  = new Scene(bp, 600,900);
		s.setScene(sc);
		s.show();
		
	}

}
