package ebs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;

public class Service_center extends Registernewuser  {
	Date showDate = new Date(0);
	   LocalDateTime now = LocalDateTime.now();
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
	Service_center() throws FileNotFoundException{
		Registernewuser registernewuser = new Registernewuser();

	}
	
	public void savenewuserinformation() throws FileNotFoundException {
		PrintWriter printWriter =  new PrintWriter("User info.txt");
		printWriter.println("					List of New Users on "+dtf.format(now) + 		" 									\n\n\n\n\n                Name --------------------------" + name +
				"\n\n Adress ------------------------------- " + address);
		printWriter.flush();
		printWriter.close();
	}
		public void saves_user_compliant_onservice() {
			
		}
		public void saves_user_payment() {
			
		}
}