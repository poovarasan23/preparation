package Design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DeckOfCards1 {
    public static void main(String[] args) {
        Deck doc=DOC.getInstance();
        doc.getDeck().stream().limit(5).forEach(System.out::println);
        doc.suffle();
        System.out.println("---------------------------------------------------------");
        doc.getDeck().stream().limit(5).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        int i=0;
        while (i<=53){
            String x=doc.draw();
            if (x != null) {
                System.out.println(x);
            }else {
                System.out.println("Design.Cards Over");
                break;
            }
            i++;
        }
    }
}

enum Rank{
    TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,J,Q,K,A;
}

enum Suite{
   SPADE,ACE,DIAMOND,HEART;
}

class Cards{
    Suite suite;
    Rank rank;

    public Cards(Suite suite, Rank rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public Suite getSuite() {
        return suite;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Design.Cards{" +
                "suite=" + suite +
                ", rank=" + rank +
                '}';
    }
}

interface Deck{
    public void suffle();
    public List <Cards> getDeck();
    public String draw();
}

class DOC implements Deck{

    private static DOC doc=null;
    private final List<Cards> cards;
    private DOC(){
        cards=new ArrayList<>();
        initialize();
    }
    private void initialize(){
        for (Suite suite:Suite.values()){
            for (Rank rank:Rank.values()){
                cards.add(new Cards(suite,rank));
            }
        }
    }

    public static DOC getInstance(){
        if (doc==null){
            doc=new DOC();
        }
        return doc;
    }

    @Override
    public void suffle(){
        Collections.shuffle(cards);
    }

    @Override
    public List <Cards> getDeck() {
        return cards;
    }

    @Override
    public String draw() {
        if (!cards.isEmpty()){
            return cards.remove(0).toString();
        }
        return null;
    }
}