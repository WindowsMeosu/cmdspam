import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class cmdspam {
public static void main(String[] args) {
    System.out.println("Here you can spam commands from command prompt, this can easily done with a .cmd or .bat file but i got bored and i haddd to create something so...");
    Scanner myObj = new Scanner(System.in);
    System.out.println("please have some mercy on devices that don't belong to you");
    String command1 = myObj.nextLine(); 
    System.out.println("logged:" + command1); 
    System.out.println("second command:");
    String command2 = myObj.nextLine();
    System.out.println("list command:");
    String command3 = myObj.nextLine(); 
    System.out.println("list command:");
    String command4 = myObj.nextLine(); 
    System.out.println("list command:");
    String command5 = myObj.nextLine(); 
    System.out.println("list command:");
    String command6 = myObj.nextLine(); 
    System.out.println("list command:");
    String command7 = myObj.nextLine(); 
    System.out.println("list command:");
    String command8 = myObj.nextLine(); 
    System.out.println("final command, edit the source code if you need to edit more:");
    String command9 = myObj.nextLine(); 
    try {
      FileWriter myWriter = new FileWriter("spam.bat");
      myWriter.write(":q");
      myWriter.write("\n @echo off \n "  + command1);
      myWriter.write("\n echo command2 in progress \n " + command2);
      myWriter.write("\n echo command3 in progress \n " + command3);
      myWriter.write("\n echo command4 in progress \n " + command4);
      myWriter.write("\n echo command5 in progress \n " + command5);
      myWriter.write("\n echo command6 in progress \n " + command6);
      myWriter.write("\n echo 7th command in progress \n " + command7);
      myWriter.write("\n echo 8th  command in progress \n " + command8);
      myWriter.write("\n echo 9th and final command in progress \n " + command9);
      myWriter.write("\n goto q");
      
      myWriter.close();
      System.out.println("We have written your command(s) to the file");
    } catch (IOException e) {
      System.out.println("An error occurred, perhaps try again later.");
      e.printStackTrace();
  } 
 } 
}