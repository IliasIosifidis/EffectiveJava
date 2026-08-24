package chapter9_GeneralProgramming.forEach;

import javax.smartcardio.Card;
import javax.swing.text.Element;
import java.util.*;

public class ElementIt {
  static List<Element> elementList = new ArrayList<>();

  static void main() {
    // Not the best way to iterate over a collection!
    for(Iterator<Element> iterator =elementList.iterator(); iterator.hasNext();){
      Element e = iterator.next();
      System.out.println(e);
    }

    // The preferred idiom for iterating over collections and arrays
    for (Element e : elementList){
      System.out.println(e);
    }

    // Can you spot the bug?
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
      NINE, TEN, JACK, QUEEN, KING }

    Collection<Suit> suits = Arrays.asList(Suit.values());
    Collection<Rank> ranks = Arrays.asList(Rank.values());

    List<Card> deck = new ArrayList<>();
    for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
      for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ){
//        deck.add(new Card(i.next(), j.next()));
      }
    // Preferred idiom for nested iteration on collections and arrays
    for (Suit suit : suits)
      for (Rank rank : ranks){
//        deck.add(new Card(suit, rank));
      }
  }


}
