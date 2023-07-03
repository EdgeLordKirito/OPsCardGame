public class CardFactory {
    private static CardFactory factory = new CardFactory();

    private CardFactory(){
        System.out.println("CardFactory was created");
    }

    public static CardFactory getInstance(){
        return factory;
    }

    public Card create(int id, int val){
        if (isLegal(id,val)){
            return new Card(id,val);
        }else{
            return null;
        }
    }

    private boolean isLegal(int id, int val){
        int iDMin = 0;
        int iDMax = 3;
        int valMin = 2;
        int valMax = 15;
        if (id < iDMin){
            return false;
        }
        if (id > iDMax){
            return false;
        }
        if (val < valMin){
            return false;
        }
        if (val > valMax){
            return false;
        }
        return true;
    }
}
