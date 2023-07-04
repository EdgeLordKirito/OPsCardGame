public class CardValueFactory {
    private static final CardValueFactory factory = new CardValueFactory();

    private CardValueFactory(){
        System.out.println("CardValueFactory was created");
    }

    public static CardValueFactory getInstance(){
        return factory;
    }

    public CardValues create(int val){
        return decode(val);
    }

    private CardValues decode(int val){
        CardValues result = null;
        switch (val){
            case 2:
                result = CardValues.TWO;
                break;
            case 3:
                result = CardValues.THREE;
                break;
            case 4:
                result = CardValues.FOUR;
                break;
            case 5:
                result = CardValues.FIVE;
                break;
            case 6:
                result = CardValues.SIX;
                break;
            case 7:
                result = CardValues.SEVEN;
                break;
            case 8:
                result = CardValues.EIGHT;
                break;
            case 9:
                result = CardValues.NINE;
                break;
            case 10:
                result = CardValues.TEN;
                break;
            case 11:
                result = CardValues.JACK;
                break;
            case 12:
                result = CardValues.QUEEN;
                break;
            case 13:
                result = CardValues.KING;
                break;
            case 14:
                result = CardValues.ACE;
                break;
            case 15:
                result = CardValues.JOKER;
                break;
            case 1:
                throw new IllegalArgumentException("Value 1 is not a Legal Argument please use a value " +
                        "between 2 inclusive and 15 inclusive");
        }
        return result;
    }
}
