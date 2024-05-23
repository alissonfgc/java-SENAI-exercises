package application;

import java.time.LocalDateTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Account;

public class MainSceneController {
	@FXML
	private TextField txtHolder;
	@FXML
	private TextField txtAgency;
	@FXML
	private TextField txtBalance;
	@FXML
	private TextField txtNumber;
	@FXML
	private Button btnCreateAccount;
	@FXML
	private Button btnWithdraw;
	@FXML
	private Button btnDeposit;
	@FXML
	private Label lblData;
	@FXML
	private TextField txtAmount;

	// Event Listener on Button[#btnCreateAccount].onAction
	@FXML
	public void btnCreateAccount(ActionEvent event) {
		String agency = txtAgency.getText();
		int number = Integer.parseInt(txtNumber.getText());
		String holder = txtHolder.getText();
		double balance = Double.parseDouble(txtBalance.getText());
		Account acc = new Account(holder, agency, number, LocalDateTime.now(), balance);
				
		lblData.setText(acc.toString());
	}
	
	// Event Listener on Button[#btnWithdraw].onAction
	@FXML
	public void btnWithdraw(ActionEvent event) {
		String agency = txtAgency.getText();
		int number = Integer.parseInt(txtNumber.getText());
		String holder = txtHolder.getText();
		double balance = Double.parseDouble(txtBalance.getText());
		Account acc = new Account(holder, agency, number, LocalDateTime.now(), balance);
		double amount = Double.parseDouble(txtAmount.getText());
		acc.withdraw(amount);
		lblData.setText(acc.toString());
	}
	// Event Listener on Button[#btnDeposit].onAction
	@FXML
	public void btnDeposit(ActionEvent event) {
		String agency = txtAgency.getText();
		int number = Integer.parseInt(txtNumber.getText());
		String holder = txtHolder.getText();
		double balance = Double.parseDouble(txtBalance.getText());
		Account acc = new Account(holder, agency, number, LocalDateTime.now(), balance);
		double amount = Double.parseDouble(txtAmount.getText());
		acc.deposit(amount);		
		lblData.setText(acc.toString());
	}
}
