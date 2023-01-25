package ebs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Registernewuser {
	Date showDate = new Date(0);
	   LocalDateTime now = LocalDateTime.now();
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
	private String name;
	public String companyorresidential;
	private int phonenumber;
	private String address;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	Registernewuser(){}
public void wellcomepage() throws IOException  {
		System.out.println("********  Wellcome to Electric Billing System   ******");
		System.out.println("Press 1 for Registration");
		System.out.println("Press 2 for Paybill");
		System.out.println("Press 3 for View Bill");
		System.out.println("Press 4 for Submit a Compliant");
		Scanner userinput = new Scanner(System.in);
		char choice1 = (char) userinput.nextInt();
			switch (choice1) {
			case 1: {
					Customerinfo();
					break;
			}
			case 2:{
				Paybill paybill = new Paybill();
				paybill.paycurrentbill();
			}
			
			default:
				System.out.print("Invalid Entery Please Try Again");
				wellcomepage();
			}
		
		}
		public void Customerinfo() throws FileNotFoundException {
			Scanner userinputScanner = new Scanner(System.in);
			System.out.println("Enter Full Name");
			setName(userinputScanner.nextLine());
			System.out.println("Company or Residential");
			companyorresidential = userinputScanner.nextLine();
			System.out.println("Enter you current Address ");
			address = userinputScanner.nextLine();
			System.out.println("Enter Email Address");
			setEmail(userinputScanner.nextLine());
			System.out.println("Enter Phonenumber");
			setPhonenumber(userinputScanner.nextInt());
			Service_center service_center = new Service_center();
			service_center.savenewuserinformation();	
			JOptionPane.showMessageDialog(null, "Registration Success");
		
		}
		public class Service_center{
			public void savenewuserinformation() throws FileNotFoundException {
				PrintWriter printWriter =  new PrintWriter("User info.txt");
				printWriter.println("		List of New Users on "
				+ 		" n\n\nFull Name-----------------------------" + getName() +
						"\n\nAddress-------------------------------" + getAddress()
						+"\n\nEmail---------------------------------" + getEmail()+""
								+ "\n\nPhone Number--------------------------"+getPhonenumber()+
								"\n\nType-----------------------------------"+companyorresidential+"\n\n"+
								"Date	"+dtf.format(now) );
				printWriter.flush();
				printWriter.close();
			}
		
		}
		
		}
		
