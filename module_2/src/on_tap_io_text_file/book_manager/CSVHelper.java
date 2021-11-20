package on_tap_io_text_file.book_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper<T> {
    List<String> readListfromCSV(String path) {
        List<String> res= new ArrayList<>();

        try {
            File file= new File(path);
            if(!file.exists())
                file.createNewFile();

            BufferedReader bufferedReader= new BufferedReader(new FileReader(path));
            String line;
            while ((line= bufferedReader.readLine())!= null){
                res.add(line);
            }
            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return res;
    }

    void writeToFileCSV(List<T> tList, String path) {
        try(BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(path))) {
            for (T t: tList){
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
