package com.techelevator;

import com.techelevator.util.TELogException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TElog {

    public static void log(String message){

        File log = new File("logs/search.log");//create file obj logs/search.log
        try(PrintWriter pw = new PrintWriter(new FileOutputStream(log, true))){
          pw.println(message);
        } catch (FileNotFoundException e) {
          throw new TELogException(e.getMessage());
        }

    }

}
