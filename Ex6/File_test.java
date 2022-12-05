package com.metanit.Ex6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_test extends File{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name_file = sc.nextLine();
        StringBuilder s = new StringBuilder();

        try(FileReader fr = new FileReader(name_file)){
            while((fr.read())!=-1){
                s.append((char) fr.read());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(getLine(s.toString()));
    }
}
