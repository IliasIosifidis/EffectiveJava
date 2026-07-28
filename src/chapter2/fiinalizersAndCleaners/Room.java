package chapter2.fiinalizersAndCleaners;

import java.lang.ref.Cleaner;

// An auto closable class using a cleaner as a safety net
public class Room implements AutoCloseable {
  private static final Cleaner cleaner = Cleaner.create();

  // Resource that requires cleaning. Must not refer to Room!
  private static class State implements Runnable{
    int numJunkPiles; // Number of junk pile in this room

    State(int numJunkPiles){
      this.numJunkPiles = numJunkPiles;
    }
    //Invoked by close method or cleaner
    @Override
    public void run() {
      System.out.println("cleaning room");
      numJunkPiles = 0;
    }
  }
  // The state of this room shared with cleanable
  private final State state;

  //Our cleanable. Cleans the room when it's eligible for GC
  private final Cleaner.Cleanable cleanable;

  public Room(int numJunkPiles){
    state = new State(numJunkPiles);
    cleanable = cleaner.register(this, state);
  }

  @Override
  public void close() throws Exception {
    cleanable.clean();
  }
}