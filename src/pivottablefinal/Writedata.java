// Created by Rodrigo
// 02/04/2017

import java.io.*;

public class Writedata {

  // Takes the username and password from user and creates a unique txt file
  public static void writeDataToFile(String userName, String hashedPwd) {

    try {
      File file = new File(userName + ".txt");
      FileWriter writer = new FileWriter(file);

      if (file.exists()) {
        writer.write(hashedPwd);
        writer.flush();
        writer.close();
      }
      System.out.println("Account for " + userName + " created!");
    }
    catch(Exception e){
        System.out.println("null");            // Always must return something
    }
  }
}
