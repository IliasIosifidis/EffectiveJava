import chapter11_Concurrency.excessiveSyncronization.ObservableSet;
import chapter11_Concurrency.excessiveSyncronization.SetObserver;

void main() {
  ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());

  set.addObserver((s,e) -> System.out.println(e));
  for (int i = 0; i < 100; i++) {
    set.add(i);
  }

  set.addObserver(new SetObserver<>(){
    public void added(ObservableSet<Integer> s, Integer e){
      System.out.println(e);
      if (e == 23){
        s.removeObserver(this);
      }
    }
  });

  // Observer that uses a background thread needlessly
  set.addObserver(new SetObserver<>() {
    public void added(ObservableSet<Integer> s, Integer e){
      System.out.println(e);
      if (e == 23){
        ExecutorService exec = Executors.newSingleThreadExecutor();
        try {
          exec.submit(() -> s.removeObserver(this)).get();
        } catch (ExecutionException | InterruptedException exception){
          throw new AssertionError(exception);
        } finally {
          exec.shutdown();
        }
      }
    }
  });

  // Alien method moved outside synchronized block - open calls
}