import java.util.*;

public class Game {
    private Deque<Card> gameStack = new ArrayDeque<>();
    private Deque<Card> orderedStack = new ArrayDeque<>();
    private List<Player> players = new ArrayList<>();

    public Game() {
    }

    public void test(){
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameStack = " + gameStack +
                ", orderedStack = " + orderedStack +
                ", players = " + players +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameStack.equals(game.gameStack) && orderedStack.equals(game.orderedStack) && players.equals(game.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameStack, orderedStack, players);
    }
}
