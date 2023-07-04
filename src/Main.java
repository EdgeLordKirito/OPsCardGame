import FileLogic.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String test = "2;2";
        Card c = CardFactory.getInstance().create(test,";");
        System.out.println(c.toString());
        FileManager manager = new FileManager();
        String path = "src/GameAssets/Deck.txt";
        List<String> list = new ArrayList<>();
        list.add("2;4");
        list.add("2;5");
        list.add("2;6");
        manager.appendAllLines(path,list);
        List<String> result = manager.readAllLines(path);
        System.out.println(result.toString());
    }
}
