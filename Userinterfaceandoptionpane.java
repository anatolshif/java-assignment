package ebs;

import javax.swing.JOptionPane;

public class Userinterfaceandoptionpane {
	Registernewuser registernewuser = new Registernewuser();
	public void showsuccessfullmessages() {
		JOptionPane.showMessageDialog(null, "Registeraion", "Registrition Success full", JOptionPane.INFORMATION_MESSAGE);
	}
}
