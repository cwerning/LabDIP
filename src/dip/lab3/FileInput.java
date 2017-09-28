/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author L115student
 */
import java.io.*;
import java.util.Scanner;

public class FileInput implements Input {

    String fileName;
    String message;

    File inFile = new File(getFileName());

    public FileInput(String fileName) {
        this.setFileName(fileName);
    }

    public final String readFile() throws FileNotFoundException {
        try (Scanner inputFile = new Scanner(inFile)) {
            while (inputFile.hasNext()) {

                message += inputFile.nextLine();

            }
        }
        return message;
    }

    @Override
    public final String getInput() throws FileNotFoundException {
        return readFile();
    }

    public final String getFileName() {
        return fileName;
    }

    public final void setFileName(String fileName) {
        if (fileName == null || fileName.length() <= 0) {

            throw new IllegalArgumentException("Error: File Name cannot be null or have nothing.");

        }
        this.fileName = fileName;
    }

}
