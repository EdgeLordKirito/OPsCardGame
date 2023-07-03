import java.util.Objects;

public class Card {
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
}
