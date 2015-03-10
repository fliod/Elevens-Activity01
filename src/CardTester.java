/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card card1=new Card("Queen", "Spades", 12);
   Card card2=new Card("King", "Diamonds", 13);
   Card card3=new Card("King", "Diamonds", 13);
   System.out.println(card1.matches(card2));
   System.out.println(card3.matches(card2));
   System.out.println(card1.rank()+card1.suit()+card1.pointValue()+card1.toString());
   System.out.println(card2.rank()+card2.suit()+card2.pointValue()+card2.toString());
   System.out.println(card3.rank()+card3.suit()+card3.pointValue()+card3.toString());
 }
}
