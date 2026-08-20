package chapter7_LambdasAndStreams.streamsJudictiously;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class CartesianProduct {
  public static List<Card> newDeck(){
    List<Card> result = new ArrayList<>();
//    for (Suit suit : Suit.values()){
//      for (Rank rank : Rank.values()){
//        result.add(new Card(suit, rank));
//      }
//    }
    return result;
  }

  private static List<Card> newStreamDeck(){
//    return Stream.of(Suit.values())
//            .flatMap(suit ->
//                    Stream.of(Rank.values())
//                            .map(rank -> new Card(suit, rank)))
//            .toList();
    return List.of();
  }
}
