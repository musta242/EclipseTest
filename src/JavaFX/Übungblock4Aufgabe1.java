package JavaFX;
import java.io.*;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.event.*;
import javafx.stage.*;


public class Übungblock4Aufgabe1 extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	@Override
	
	public void start(Stage s) throws Exception{
		FlowPane fp = new FlowPane();
		Scene scene = new Scene(fp, 300,300);
		Label label = new Label("Text:");
		TextField textfeld = new TextField();
		Button button = new Button("drück mich");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String filename = textfeld.getText();
				Stage neuesFenster = new Stage();
				FlowPane newfp = new FlowPane();
				Scene newscene = new Scene(fp, 300, 300);
				Label newlabel = new Label();
				
				newfp.getChildren().add(newlabel);
				neuesFenster.setScene(newscene);
				neuesFenster.show();
				
				BufferedReader read = null;
				try {
					read  = new BufferedReader(new FileReader(filename));
					String s = "";
					String text = null;
					while((s = read.readLine()) != null) {
						s = text + s;
					}
					label.setText(s);
				}catch(IOException e) {
					label.setText(e.getMessage());
				}finally {
					try {
						read.close();				
						}catch(IOException e) {
							label.setText(e.getMessage());
						}
				}
			}
		});
		fp.getChildren().add(label);
		fp.getChildren().add(textfeld);
		fp.getChildren().add(button);
		
		s.setScene(scene);
		s.show();
	}

}
