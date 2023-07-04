import java.util.Objects;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Card implements Comparable{
    private int cardID;
    private CardIdentifier namedID;
    private int value;
    private CardValues namedValue;

    public Card(int cardID, int value) {
        this.cardID = cardID;
        this.namedID = CardIdentifierFactory.getInstance().create(cardID);
        this.value = value;
        this.namedValue = CardValueFactory.getInstance().create(value);
    }

    @Override
    public String toString() {
        return "Card{" +
                "namedID:'" + namedID + "'" + ", " +
                "namedValue:'" + namedValue + "'" +
                '}';
    }

    public String toStringDebug(){
        return "Card{" +
                "cardID: '" + cardID + "'" +
                ", namedID: '" + namedID + "'" +
                ", value: '" + value + "'" +
                ", namedValue: '" + namedValue + "'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardID == card.cardID && value == card.value && namedID == card.namedID && namedValue == card.namedValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardID, namedID, value, namedValue);
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if (isNull(o)){
            throw new NullPointerException();
        }
        Card card = (Card) o;
        if (this.equals(card)){
            return 0;
        }
        if (this.value < card.value){
            result = -1;
        }
        if (this.value > card.value){
            result = 1;
        }
        return result;
    }

    public int getCardID() {
        return cardID;
    }

    public CardIdentifier getNamedID() {
        return namedID;
    }

    public int getValue() {
        return value;
    }

    public CardValues getNamedValue() {
        return namedValue;
    }
}
