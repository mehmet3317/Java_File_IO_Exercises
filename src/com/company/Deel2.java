package com.company;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;


public class Deel2 {

    public static void main(String[] args) throws IOException {


        Path path = Path.of("/Users/mehmetozturk/Documents/test.txt");

        FileWriter file = new FileWriter(path.toFile());

        try {

            file.write("siuuuuuu");

            System.out.println("Successfully written");

        } catch (Exception e) {
            e.getStackTrace();
        }
        finally {
            file.close();
        }
    }
}