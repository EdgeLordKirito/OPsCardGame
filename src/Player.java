import java.util.Arrays;
import java.util.Objects;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Player {
    private final int INITIAL_SIZE = 3;
    private int id = 0;
    private Card[] faceUps = new Card[INITIAL_SIZE];
    private Card[] faceDowns = new Card[INITIAL_SIZE];
    private Hand handCards = new Hand();

    public Player(int id) {
        this.id = id;
        this.faceUps = new Card[INITIAL_SIZE];
        this.faceDowns = new Card[INITIAL_SIZE];
        this.handCards = new Hand();
    }

    public Player(int id, Card[] faceUps, Card[] faceDowns) {
        if (isNull(faceUps) || isNull(faceDowns)){
            throw new NullPointerException();
        }
        if (faceUps.length == faceDowns.length && faceUps.length == INITIAL_SIZE){
            this.id = id;
            this.faceUps = faceUps;
            this.faceDowns = faceDowns;
        }
        this.handCards = new Hand();
    }

    public Player(int id, Card[] faceUps, Card[] faceDowns, Hand handCards) {
        if (isNull(faceUps) || isNull(faceDowns) || isNull(handCards)){
            throw new NullPointerException();
        }
        this.id = id;
        this.faceUps = faceUps;
        this.faceDowns = faceDowns;
        this.handCards = handCards;
    }

    public void addCardToHand(Card card){
        handCards.add(card);
    }

    private Card playFaceUpAtIndex(int index){
        if (index < 0){
            throw new IndexOutOfBoundsException("Given index is smaller than: 0");
        }
        if (index > faceUps.length){
            throw new IndexOutOfBoundsException("Given Index is larger than: " + faceUps.length);
        }
        Card save = faceUps[index];
        faceUps[index] = null;
        return save;
    }

    private Card playFaceDownAtIndex(int index){
        if (index < 0){
            throw new IndexOutOfBoundsException("Given index is smaller than: 0");
        }
        if (index > faceUps.length){
            throw new IndexOutOfBoundsException("Given Index is larger than: " + faceDowns.length);
        }
        Card save = faceDowns[index];
        faceDowns[index] = null;
        return save;
    }

    public void setFaceUps(Card[] faceUps) {
        this.faceUps = faceUps;
    }

    public void setFaceDowns(Card[] faceDowns) {
        this.faceDowns = faceDowns;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id = " + id +
                ", faceUps = " + Arrays.toString(faceUps) +
                ", faceDowns = " + Arrays.toString(faceDowns) +
                ", handCards = " + handCards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Arrays.equals(faceUps, player.faceUps) && Arrays.equals(faceDowns, player.faceDowns) && handCards.equals(player.handCards);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, handCards);
        result = 31 * result + Arrays.hashCode(faceUps);
        result = 31 * result + Arrays.hashCode(faceDowns);
        return result;
    }
}
