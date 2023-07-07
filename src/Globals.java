public class Globals {
    public static final DeckSet DECK_WITHOUT_JOKERS_FROM_DISK = DeckSet.loadDeckFromDisk("src/GameAssets/Deck.txt");
    public static final DeckSet JOKERS_FROM_DISK = DeckSet.loadDeckFromDisk("src/GameAssets/Joker.txt");
    public static final DeckSet FULL_DECK_FROM_DISK = DeckSet.union(DECK_WITHOUT_JOKERS_FROM_DISK,JOKERS_FROM_DISK);
    public static final DeckSet SPECIAL_CARDS = DeckSet.loadDeckFromDisk("src/GameAssets/SpecialCards.txt");
}
