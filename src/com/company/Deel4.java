package com.company;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;


public class Deel4 {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("/Users/mehmetozturk/Documents/test.txt");


        try (FileWriter fileWriter = new FileWriter(path.toFile(),true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("hallo");
            bufferedWriter.write("iedereen");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}