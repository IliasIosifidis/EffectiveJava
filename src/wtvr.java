void main() {
  System.out.println(stands.notThree());
}
public enum stands {
  ONE, TWO,THREE, FOUR;

  public static EnumSet notThree(){
    return EnumSet.complementOf(EnumSet.of(stands.THREE));
  }
}