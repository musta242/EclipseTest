package Altklausur2024;


import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.*;
public class fxaufgabe extends Application{
	public static void main(String[]args) {
		launch(args);
	}
	public void start(Stage s) throws Exception{
		TextField text = new TextField();
		RadioButton b1 = new RadioButton("Grossbuchstabe");
		RadioButton b2 = new RadioButton("Überprüfung");
		Button b3 = new Button("ok");
		Label l = new Label();
		
		ToggleGroup gruppe = new ToggleGroup();
		b1.setToggleGroup(gruppe);
		b2.setToggleGroup(gruppe);
		b1.setSelected(true);
		b3.setDefaultButton(true);
		
		HBox box = new HBox(text,b1,b2,b3,l);
		box.setAlignment(Pos.CENTER);
		BorderPane border = new BorderPane();
		border.setCenter(box);
		b3.setOnAction(e ->{
			if(b1.isSelected()) {
				String eingabe = text.getText();
				text.setText(eingabe.toUpperCase());
			}
			else if(b2.isSelected()) {
				String eingabe = text.getText();
				if(eingabe.matches("PRO\\d{4}-[A-Z]{3,5}")) {
					l.setText("korrekt");
				}
				else {
					l.setText("Nicht korrekt");
				}
			}
		});
		Scene scene = new Scene(border, 600,400);
		s.setScene(scene);
		s.show();
	}
}
