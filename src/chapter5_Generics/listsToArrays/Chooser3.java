package chapter5_Generics.listsToArrays;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser3<T>{

  private final List<T> choiceList;

  public Chooser3(Collection<T> choices){
    choiceList = new ArrayList<>(choices);
  }
  public Object choose(){
    Random random = ThreadLocalRandom.current();
    return choiceList.get(random.nextInt(choiceList.size()));
  }
}