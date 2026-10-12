package Altklausur2024;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Taschenrechner extends Application {
	public static void main(String[]args) {
		launch(args);
}
	public void start(Stage s) {
		Label l = new Label();
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		Button add = new Button("Addieren");
		Button sub = new Button("Subtrahieren");
		Button mul = new Button("Multiplizieren");
		Button div = new Button("Dividieren");
		HBox box = new HBox(add,sub,mul,div,t1,t2,l);
		Scene sc = new Scene(box,600,400);
		s.setScene(sc);
		s.show();
		
		add.setOnAction(e->{
			try {
			double zahl1 = Double.parseDouble(t1.getText());
			double zahl2 = Double.parseDouble(t2.getText());
			double ergebnis = zahl1 + zahl2;
			l.setText("Ergebnis" + ergebnis);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		});
		sub.setOnAction(e->{
			try {
				double zahl1 = Double.parseDouble(t1.getText());
				double zahl2 = Double.parseDouble(t2.getText());
				double ergebnis = zahl1 - zahl2;
				l.setText("Ergebnis" + ergebnis);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
		});
		mul.setOnAction(e->{
			try {
				double zahl1 = Double.parseDouble(t1.getText());
				double zahl2 = Double.parseDouble(t2.getText());
				double ergebnis = zahl1 * zahl2;
				l.setText("Ergebnis" + ergebnis);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
		});
		div.setOnAction(e->{
			try {
				double zahl1 = Double.parseDouble(t1.getText());
				double zahl2 = Double.parseDouble(t2.getText());
				double ergebnis = zahl1 / zahl2;
				l.setText("Ergebnis" + ergebnis);
				}catch(Exception e1) {
					System.out.println("Division mit 0");
				}
		});
	}
}
