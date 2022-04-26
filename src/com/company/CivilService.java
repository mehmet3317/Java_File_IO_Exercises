package com.company;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CivilService {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/mehmetozturk/Documents/test.txt");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {

            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}