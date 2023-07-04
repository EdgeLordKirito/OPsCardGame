import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand {
    private final List<Card> hand = new ArrayList<>();

    public boolean add(Card card){
        return hand.add(card);
    }

    public boolean remove(Card card){
        return hand.remove(card);
    }

    public boolean contains(Card card){
        return hand.contains(card);
    }

    public void shuffle(){
        Collections.shuffle(hand);
    }

    public void sortAscending(){
        sortByID();
        hand.sort(Comparator.naturalOrder());
    }

    public void sortDescending(){
        sortByID();
        hand.sort(Comparator.reverseOrder());
    }

    private void sortByID(){
        List<Card> hearts = new ArrayList<>();
        List<Card> diamonds = new ArrayList<>();
        List<Card> clubs = new ArrayList<>();
        List<Card> spades = new ArrayList<>();
        for (Card c :this.hand) {
            switch (c.getNamedID()){
                case HEARTS -> hearts.add(c);
                case DIAMONDS -> diamonds.add(c);
                case CLUBS -> clubs.add(c);
                case SPADES -> spades.add(c);
            }
        }
        this.hand.clear();
        this.hand.addAll(hearts);
        this.hand.addAll(diamonds);
        this.hand.addAll(clubs);
        this.hand.addAll(spades);
    }

    public String toString(){
        return hand.toString();
    }
}
