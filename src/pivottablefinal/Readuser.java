// Created by Rodrigo
// 02/04/2017

import java.io.*;
import javax.swing.JFrame;

public class Readuser {

// Use the username to read the file with the password
public static boolean readUserProfile(String userName, String inputedPwd) {
    
    try {
        File file = new File(userName + ".txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
//            stringBuffer.append("\n");
	}
        fileReader.close();
        
        if(inputedPwd.equals(stringBuffer.toString())) {
            System.out.println("PWD Checked!!!");
            return true;
        } else {
            System.out.println("Not the same PWD!!!");
            return false;
        }
//			System.out.println(userName + "'s pwd:");
//			System.out.println(stringBuffer.toString());
	} catch (IOException e) {
            e.printStackTrace();
            return false;
        }
  }
}
