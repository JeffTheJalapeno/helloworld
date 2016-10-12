/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author jtharris01
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println();
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            ArrayList<String> lines = new ArrayList<>();
            String line = "";
            while((line = in.readLine()) != null){
                lines.add(line);
            }
            for(String s: lines)
                System.out.println(s);
        }
        catch(FileNotFoundException e){
            
        }
        catch(IOException e){
            
        }
        // TODO code application logic here
    }
    
}
