package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	//Text Fields Time Variables
	@FXML
	private TextField txtHours;
	@FXML
	private TextField txtMins;
	@FXML
	private TextField txtSecs;
	@FXML
	private TextField txtMilliseconds;
	
	//Spinner
	@FXML
	private Spinner<Integer> spinnerTimes;
	int currentValueSpinner;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = 
				new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 1000);
		
		valueFactory.setValue(1);
		spinnerTimes.setValueFactory(valueFactory);
		currentValueSpinner = spinnerTimes.getValue();
	}
}
