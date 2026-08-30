package chapter11_Concurrency.excessiveSyncronization;

@FunctionalInterface
public interface SetObserver<E> {
  // Invoke when an element is added to the observable set
  void added(ObservableSet<E> set, E element);
}
