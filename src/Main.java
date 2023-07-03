public class Main {
    public static void main(String[] args) {
        Card c = CardFactory.getInstance().create(2,2);
        System.out.println(c.toString());
    }
}
