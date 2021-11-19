package com.vichet.patterns.behavioral.template;

import java.util.Scanner;

// Template class
public abstract class FileProcessor {
    public final void processFile() { // Template method - final - no sub-class can override for use only
        // Step of code to solve problem
        // ****** for example **********
        // step 1 - open a file
        // step 2 - read a file
        // step 3 - write a file
        // step 4 - save a file, if step 3 is executed
        // step 5 - close a file

        boolean isWriteFile = false;

        // open file
        openFile();

        // either write or read
        isWriteFile = isUserWantWrite();
        if (isWriteFile){
            writeFile();
        }else{
            readFile();
        }

        // if writes then save as well
        if (isWriteFile){
            saveFile();
        }

        // close the file
        closeFile();
    }

    public abstract void writeFile();
    public abstract void readFile();

    public void openFile() {
        System.out.println("Opening the file ...");
    }
    public void closeFile(){
        System.out.println("Closing the file ...");
    }
    public void saveFile(){
        System.out.println("Saving the file ...");
    }
    public boolean isUserWantWrite(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to write file (y/n) ?");
        String answer = keyboard.nextLine();
        return answer.equalsIgnoreCase("y");
    }
}
