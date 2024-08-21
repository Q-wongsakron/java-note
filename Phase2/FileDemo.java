package Phase2;

import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        File f = new File("Demo.txt");

        // create file
        try{
            FileWriter writer = new FileWriter(f);
            writer.write("Hello World");
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        // read file จะได้เป็น unicode (int)
        try{
            FileReader reader = new FileReader(new File("Demo.txt"));
            int data;
            while((data = reader.read()) != -1){
                System.out.printf("%c\n", data);
            }
        
        }catch(Exception e){    
            e.printStackTrace();
        }
    }
}
