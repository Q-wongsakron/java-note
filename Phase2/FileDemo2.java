package Phase2;

import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter(new File("BufferdWrite.txt"));
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("Hello World \n");
            bw.write("Write With Java");
            bw.close();

            System.out.println("write file done!");
        }catch(Exception e){
            e.printStackTrace();
        }

        // buffered reader
        try{
            FileReader reader = new FileReader(new File("BufferdWrite.txt"));
            BufferedReader br = new BufferedReader(reader);
            
            String mg = "";

            while((mg = br.readLine()) != null){
                System.out.println(mg);
            }


            System.out.println("Read file done!");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
