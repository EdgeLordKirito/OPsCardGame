import java.util.ArrayList;
import java.util.List;

public class GameCardStack {
    private List<Card> values;
    private Card lastNonRuleChangedCard;
    private int lastIndex = 0;

    public GameCardStack() {
        this.values = new ArrayList<>();
        this.lastNonRuleChangedCard = null;
        this.lastIndex = 0;
    }

    public void addCard(Card card){
        if (Globals.SPECIAL_CARDS.contains(card)){
            values.add(card);
            System.out.println("This Card is Special");
            this.lastNonRuleChangedCard = values.get(lastIndex);
        }else{
            values.add(card);
            this.lastIndex = values.size() - 1;
            this.lastNonRuleChangedCard = values.get(lastIndex);
        }
    }

    public String test(){
        String s = values.size() + ";" + lastIndex;
        return s;
    }

    public Card getLastNonRuleChangedCard() {
        return lastNonRuleChangedCard;
    }
}
