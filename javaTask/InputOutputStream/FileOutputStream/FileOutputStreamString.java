package pack;

import java.io.FileOutputStream;

public class FileOutputStreamString {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("textFile1.txt");

            // For writing into string
            String s = "Hello! How are you?";

            // Convert String into bytes
            byte[] b = s.getBytes();

            fout.write(b);
            fout.close();
            System.out.println("Successfully done...!");
        }catch (Exception e){
            System.err.println(e);;
        }
    }
}
