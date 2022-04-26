package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {



      try{
          Path path = Path.of("/Users/mehmetozturk/Documents/test.txt");

          FileOwnerAttributeView file = Files.getFileAttributeView(path,
                  FileOwnerAttributeView.class);
          Files.createDirectories(path.getParent());
            if(Files.notExists(path)){
                Files.createFile(path);
                System.out.println("file created");
            }
            else {
                System.out.println("file already exist");
            }


       List <String> lines = new ArrayList<>();
       lines.add("hello");
       lines.add("world");
       Files.write(path,lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

        BasicFileAttributes attrs=Files.readAttributes(path,BasicFileAttributes.class);

        System.out.println(attrs.size());
        System.out.println(attrs.creationTime());
        System.out.println(attrs.lastAccessTime());
        System.out.println(attrs.lastModifiedTime());
       /* System.out.println(attrs.isArchive());
        System.out.println(attrs.isHidden());
        System.out.println(attrs.isReadOnly());*/

       Files.lines(path).forEach(System.out::println);


       Files.lines(path);

          UserPrincipal user = file.getOwner();

          // Printing the owner's name
          System.out.println("Owner: " + user.getName());

          Files.move(path, path.resolveSibling(
                  "renamedFile.java"));
          System.out.println("File is Successfully Renamed");

      }catch (IOException e){
          e.printStackTrace();
      }


    }
}
