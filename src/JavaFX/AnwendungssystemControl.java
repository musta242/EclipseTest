package JavaFX;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AnwendungssystemControl {
	private AnwendersystemModel anwModel;
	private AnwendersystemView anwView;
	
	public void schreibeInDatei(String text){
		try{
		    BufferedWriter aus 
	 			= new BufferedWriter(new FileWriter("Text.txt"));
	       	aus.write(text);
	       	aus.close();
	       	zeigeInformationsfensterAn("Der Text wurde in die Datei geschrieben.");
		}
		catch(Exception exc){	   
			zeigeFehlermeldungAn("Fehler beim Schreiben in die Datei.");
		}
	}

	public AnwendungssystemControl(Stage stage) {
		super();
		this.anwModel = new AnwendersystemModel();
		this.anwView = new AnwendersystemView(this, stage,anwModel);
	}
	private void zeigeInformationsfensterAn(String meldung){
	    Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Information");
	    alert.setContentText(meldung);
		alert.showAndWait();
	}
	    
	private void zeigeFehlermeldungAn(String meldung){
	    Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Fehlermeldung");
		alert.setContentText(meldung);
		alert.showAndWait();
	}
}
