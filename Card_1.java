package texasholdemcodeproject;

 
import javax.swing;

import java.util.*;

public class Card_1{
    private short rank, suit;
    //d->diamonds, c->club, s->spades, h->hearts
    
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    
    /**Image AD;
    Image 2D;

    Image 3D;
    Image 4D;
    Image 5D;
    Image 6D;
    Image 7D;
    Image 8D;
    Image 9D;
    Image 10D;
    Image JD;
    Image QD;
    Image KD; 
    Image AH, 2H, 3H, 4H, 5H, 6H, 7H, 8H, 9H, 10H, JH, QH, KH; 
    Image AS, 2S, 3S, 4S, 5S, 6S, 7S, 8S, 9S, 10S, JS, QS, KS; 
    Image AC, 2C, 3C, 4C, 5C, 6C, 7C, 8C, 9C, 10C, JC, QC, KC; 
    
    
    int AD, AH, AS, AC = 1**/
    
    

    //Constructor
    public Card(short rank, short suit){
        this.rank = rank;
        this.suit = suit;
    }

    // Getter and Setters
    public short getSuit(){
        return suit;
    }

    public short getRank(){
        return rank;
    }

    protected void setSuit(short suit){
        this.suit = suit;
    }

    protected void setRank(short rank){
        this.rank = rank;
    }

    // methods
    public static String rankAsString(int __rank){
        return ranks[__rank];
    }

    public static String suitAsString(int __suit){
        return suits[__suit];
    }

    public @Override String toString(){
        return rank + " of " + suit;
    }

    // Print card to string
    protected String printCard(){
        return ranks[rank] + " of " + suits[suit];
    }

    // Determine if two cards are the same (Ace of Diamonds == Ace of Diamonds)
    public static boolean sameCard(Card card1, Card card2){
        return (card1.rank == card2.rank && card1.suit == card2.suit);
    }   

}

class rankComparator implements Comparator<Object>{
    public int compare(Object card1, Object card2) throws ClassCastException{
        // verify two Card objects are passed in
        if (!((card1 instanceof Card) && (card2 instanceof Card))){
            throw new ClassCastException("A Card object was expeected.  Parameter 1 class: " + card1.getClass() 
                    + " Parameter 2 class: " + card2.getClass());
        }

        short rank1 = ((Card)card1).getRank();
        short rank2 = ((Card)card2).getRank();

        return rank1 - rank2;
    }
}

class suitComparator implements Comparator<Object>{
    public int compare(Object card1, Object card2) throws ClassCastException{
        // verify two Card objects are passed in
        if (!((card1 instanceof Card) && (card2 instanceof Card))){
            throw new ClassCastException("A Card object was expeected.  Parameter 1 class: " + card1.getClass() 
                    + " Parameter 2 class: " + card2.getClass());
        }

        short suit1 = ((Card)card1).getSuit();
        short suit2 = ((Card)card2).getSuit();

        return suit1 - suit2;
    }
}