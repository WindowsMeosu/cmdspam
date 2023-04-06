import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class catsp {
public static void main(String[] args) {
    System.out.println("Here you can spam commands from command prompt, this can easily done with a .cmd or .bat file but i got bored and i haddd to create something so... This, however, goes well above 9 (it goes up to 20).");
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
    System.out.println("list command:");
    String command9 = myObj.nextLine();
    System.out.println("list command:");
    String command10 = myObj.nextLine();
    System.out.println("list command:");
    String command11 = myObj.nextLine();
    System.out.println("list command:");
    String command12 = myObj.nextLine();
    System.out.println("list command:");
    String command13 = myObj.nextLine();
    System.out.println("list command:");
    String command14 = myObj.nextLine();
    System.out.println("list command:");
    String command15 = myObj.nextLine();
    System.out.println("list command:");
    String command16 = myObj.nextLine();
    System.out.println("list command:");
    String command17 = myObj.nextLine();
    System.out.println("list command:");
    String command18 = myObj.nextLine();
    System.out.println("list command:");
    String command19 = myObj.nextLine();
    System.out.println("final command, edit the source code if you need to edit more:");
    String command20 = myObj.nextLine(); 
    try {
      FileWriter myWriter = new FileWriter("spam.bat");
      myWriter.write(":q");
      myWriter.write("\n @echo off \n "  + command1);
      myWriter.write("\n echo command2 in progress \n " + command2);
      myWriter.write("\n echo command3 in progress \n " + command3);
      myWriter.write("\n echo command4 in progress \n " + command4);
      myWriter.write("\n echo command5 in progress \n " + command5);
      myWriter.write("\n echo command6 in progress \n " + command6);
      myWriter.write("\n echo command7 command in progress \n " + command7);
      myWriter.write("\n echo command8  command in progress \n " + command8);
      myWriter.write("\n echo command9 command in progress \n " + command9);
      myWriter.write("\n echo command10 in progress \n " + command10);
      myWriter.write("\n echo command11 in progress \n " + command11);
      myWriter.write("\n echo command12 in progress \n " + command12);
      myWriter.write("\n echo command13 in progress \n " + command13);
      myWriter.write("\n echo command14 in progress \n " + command14);
      myWriter.write("\n echo command15 in progress \n " + command15);
      myWriter.write("\n echo command16 in progress \n " + command16);
      myWriter.write("\n echo command17 in progress \n " + command17);
       myWriter.write("\n echo command18 in progress \n " + command18);
       myWriter.write("\n echo command19 in progress \n " + command19);
       myWriter.write("\n echo command20 in progress \n " + command20);
       myWriter.write("\n goto q");
       
      myWriter.close();
      System.out.println("We have written your command(s) to the file");
    } catch (IOException e) {
      System.out.println("An error occurred, perhaps try again later.");
      e.printStackTrace();
  } 
 } 
}
