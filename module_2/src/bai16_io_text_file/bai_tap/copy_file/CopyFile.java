package bai16_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static void copyFile(String source,String des) throws IOException{
        FileInputStream sourceFile = new FileInputStream(source);

        FileOutputStream destFile = new FileOutputStream(des);

        byte[] array = new byte[1024];
        sourceFile.read(array);
        destFile.write(array);

        sourceFile.close();
        destFile.close();
    }


    private static void writeNumberCharacter(String path) throws IOException{
        File file= new File(path);
        if(!file.canRead())
            file.setReadable(true);
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        String line;
        String tmp= "";
        while ((line= bufferedReader.readLine())!= null) {
            tmp+= line;
        }
        bufferedReader.close();

        int res= tmp.replace(" ", "").length();
        System.out.println(res);

        // java 11 have method Files.writeString, Files.readString
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write("\nTotal charater in file: "+ res);
        bufferedWriter.close();
    }
    public static void main(String[] args) {
        String source = "src/bai16_io_text_file/bai_tap/copy_file/text.txt";
        String target ="src/bai16_io_text_file/bai_tap/copy_file/text_copy";
        try {
            copyFile(source,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writeNumberCharacter(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
