import FileLogic.FileManager;

import java.util.ArrayList;
import java.util.List;

public class DeckSet extends ArrayList<Card> {

    @Override
    public boolean add(Card card) {
        if (contains(card)){
            return false;
        }else{
            return super.add(card);
        }
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    public static DeckSet loadDeckFromDisk(String path){
        FileManager manager = new FileManager();
        DeckSet d = new DeckSet();
        List<String> lines = manager.readAllLines(path);
        CardFactory fac = CardFactory.getInstance();
        String regex = ";";
        for (String s: lines) {
            d.add(fac.create(s,regex));
        }
        return d;
    }

    public static DeckSet union(DeckSet first, DeckSet second){
        List<Card> heart = new ArrayList<>();
        List<Card> diamond = new ArrayList<>();
        List<Card> club = new ArrayList<>();
        List<Card> spades = new ArrayList<>();
        for (Card card : first) {
            switch (card.getNamedID()){
                case HEARTS -> heart.add(card);
                case DIAMONDS -> diamond.add(card);
                case CLUBS -> club.add(card);
                case SPADES -> spades.add(card);
            }
        }
        for (Card card : second) {
            switch (card.getNamedID()){
                case HEARTS -> heart.add(card);
                case DIAMONDS -> diamond.add(card);
                case CLUBS -> club.add(card);
                case SPADES -> spades.add(card);
            }
        }
        DeckSet result = new DeckSet();
        result.addAll(heart);
        result.addAll(diamond);
        result.addAll(club);
        result.addAll(spades);
        return result;
    }
}
