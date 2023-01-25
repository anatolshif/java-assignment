import java.io.File;


import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class asdf1234{
    public static void main(String [] args){
       try{//asks the user to type their feedback
       System.out.println("please go ahead and give us your feedback :) .");
       //creating an obj using the scanner class
       Scanner mySc = new Scanner(System.in);
       //myscanner is where I store the user input
       String myScanner = mySc.nextLine();
       
       //
       FileWriter writer = new FileWriter("chevy.txt",true);
       //
       writer.write(myScanner+"\n");
       writer.close();
       System.out.print("your feedback is highly appreciated, thank you.");}
       catch(IOException e){
        System.out.println("an error has occurred.");
        e.printStackTrace();
       }
    }
}