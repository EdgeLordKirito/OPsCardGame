public class CardIdentifierFactory {
    private static final CardIdentifierFactory factory = new CardIdentifierFactory();

    private CardIdentifierFactory(){
        System.out.println("CardIdentifierFactory was created");
    }

    public static CardIdentifierFactory getInstance(){
        return factory;
    }

    public CardIdentifier create(int val){
        return decode(val);
    }

    private CardIdentifier decode(int val){
        CardIdentifier result = null;
        switch (val){
            case 0:
                result = CardIdentifier.HEARTS;
                break;
            case 1:
                result = CardIdentifier.DIAMONDS;
                break;
            case 2:
                result = CardIdentifier.CLUBS;
                break;
            case 3:
                result = CardIdentifier.SPADES;
                break;
        }
        return result;
    }
}
