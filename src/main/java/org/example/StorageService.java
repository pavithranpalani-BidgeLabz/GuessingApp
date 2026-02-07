package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StorageService {
    public static void storeDatasTofile(int attempts,String name,int win) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("game_Results.txt",true))){
            bw.write("Player Name: "+name+"\n"+"Attempts: "+attempts+"\n"+"Results: "+((win>0)?"Win":"Loss")+"\n");
            bw.newLine();
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Result Datas are unable to be stored");
        }
    }

}