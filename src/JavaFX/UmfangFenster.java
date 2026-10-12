package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UmfangFenster {
	public void show() {
		Stage s = new Stage();
		s.setTitle("Umfang berechnen");
		
		RadioButton radius = new RadioButton("Radius");
		RadioButton durchmesser = new RadioButton("Durchmesser");
		ToggleGroup togglegroup = new ToggleGroup();
		radius.setToggleGroup(togglegroup);
		durchmesser.setToggleGroup(togglegroup);
		radius.setSelected(true);
		
		Label label = new Label("Radius:");
		TextField text = new TextField();
		Label ergebnis = new Label();
		Button berechnen = new Button("Berechnen");
		
		berechnen.setOnAction(e-> {
			try {
				double eingabe = Double.parseDouble(text.getText());
				double umfang;
				if(radius.isSelected()) {
					umfang = 2 * eingabe * Math.PI;
				}
				else {
					umfang = eingabe * Math.PI;
				}
				ergebnis.setText(String.format("Umfang: %.2f", umfang));
			} catch (NumberFormatException ex) {
				ergebnis.setText("gebe gültige Zahl ein");
			}
		});
		FlowPane fp = new FlowPane();
		fp.getChildren().add(label);
		fp.getChildren().add(text);
		fp.getChildren().add(ergebnis);
		fp.getChildren().add(berechnen);
		fp.getChildren().add(radius);
		fp.getChildren().add(durchmesser);
		Scene scene = new Scene(fp,400,200);
		s.setScene(scene);
		s.show();
		}
}
