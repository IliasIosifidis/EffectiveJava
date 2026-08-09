package chapter5_Generics.boundedCards;

import java.util.Collection;
import java.util.Set;

public class ChooserExample <T> {
  public void Chooser(Collection<? extends T> choices){};
}
