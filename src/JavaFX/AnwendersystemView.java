package JavaFX;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnwendersystemView {
	private AnwendungssystemControl anwControl;
	private AnwendersystemModel anwModel;
	
	private GridPane grid     = new GridPane();
	private TextField txtTest = new TextField();
	private Button btnTest    = new Button("Test");
	public AnwendersystemView(AnwendungssystemControl anwControl,Stage stage, AnwendersystemModel anwModel) {
		super();
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		
		this.grid.setAlignment(Pos.CENTER);
		this.grid.setHgap(10);
		this.grid.setVgap(10);
		this.grid.setPadding(new Insets(25, 25, 25, 25));
		stage.setTitle("Hallo");
	    Scene scene = new Scene(grid, 350, 150);
		stage.setScene(scene);
        stage.show();
        
		this.initKomponenten();
		this.initListener();
	}
	private void initKomponenten(){
	    this.grid.add(this.txtTest, 0, 0);
	    this.grid.add(this.btnTest, 1, 0);
	}	
	
	private void initListener(){
		  btnTest.setOnAction(new EventHandler<ActionEvent>() {
	            @Override
	            public void handle(ActionEvent e) {
	            	  anwControl.schreibeInDatei(txtTest.getText());
	            }
	      });
	}	
	
}
