public class Main {
    public static void main(String[] args) {
        System.out.println(Globals.FULL_DECK_FROM_DISK);
        Game g = new Game();
        GameCardStack s = new GameCardStack();
        s.addCard(new Card(0,2));
        s.addCard(new Card(1,5));
        s.addCard(new Card(2,6));
        s.addCard(new Card(3,15));
        System.out.println(s.test());
//        System.out.println(s.test());
        System.out.println(s.getLastNonRuleChangedCard());
        System.out.println(Globals.SPECIAL_CARDS);
    }
}
