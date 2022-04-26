package com.company;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Deel3 {

    public static void main(String[] args) throws IOException {


        Path path = Path.of("/Users/mehmetozturk/Documents/test.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}