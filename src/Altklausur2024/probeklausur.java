package Altklausur2024;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class probeklausur extends Application {
	public static void main(String[]args) {
		launch(args);
	}
	public void start(Stage s) throws Exception{
		Button flächeninhalt = new Button("Flächeninhalt");
		Button umfang = new Button("umfang");
		flächeninhalt.setDisable(true);
		HBox h = new HBox(flächeninhalt, umfang);
		Scene scene = new Scene(h,600,400);
		s.setScene(scene);
		s.show();
		
		umfang.setOnAction(e ->{
				Stage s2 = new Stage();
				RadioButton durchmesser = new RadioButton("durchmesser");
				RadioButton radius = new RadioButton("Radius");
				ToggleGroup group = new ToggleGroup();
				durchmesser.setToggleGroup(group);
				radius.setToggleGroup(group);
				radius.setSelected(true);
				Label wert = new Label("wert eingeben");
				Button b = new Button("berechne");
				Label ergebnis = new Label();
				TextField text = new TextField();
				b.setOnAction(ev ->{
						double werte = Double.parseDouble(text.getText());
						double u;
						if(radius.isSelected()) {
							u =  2 * werte * Math.PI;
						}
						else {
							u =  werte * Math.PI;
						}
						ergebnis.setText("Umfang: " + u);
				});
				HBox h2 = new HBox(radius, durchmesser, ergebnis, text, b );

				Scene scene2 = new Scene(h2, 600, 400);
				s2.setScene(scene2);
				s2.show();
		});
	}
}
