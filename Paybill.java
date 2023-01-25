package ebs;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Paybill extends Registernewuser {
	Registernewuser registernewuser = new Registernewuser();
	Scanner userinput = new Scanner(System.in);
public void paycurrentbill() {
	System.out.println("Enter your name");
	setName(userinput.nextLine());
	System.out.println("Enter address");
	setaddress(userinput.nextLine());
	
}
}
