package chapter2.fiinalizersAndCleaners;

public class Adult{
  public static void main() throws Exception {
    try(Room myRoom = new Room(7)) {
      System.out.println("good bye");
    }
  }
}

