package pack;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("textFile.txt");

            // This is example for writing bytes into file
            fout.write(65);
            fout.close();
            System.out.println("Successfully done....!");
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
