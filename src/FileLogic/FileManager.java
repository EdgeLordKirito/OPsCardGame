package FileLogic;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import static java.util.Objects.isNull;

public class FileManager {
    public List<String> readAllLines(String p){
        List<String> result = null;
        Path path = Paths.get(p);
        try{
            result = Files.readAllLines(path);
        }catch(IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public void appendLine(String p,String info){
        Path path = Paths.get(p);
        String message = System.lineSeparator() + info;
        try {
            Files.writeString(path,message,StandardOpenOption.APPEND);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void appendAllLines(String p,List<String> list){
        if (isNull(list)){
            return;
        }
        for (String s: list) {
            appendLine(p,s);
        }
    }
}
