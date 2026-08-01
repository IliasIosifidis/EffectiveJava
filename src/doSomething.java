void main() {
  EnumSet<DayOfWeek> day = EnumSet.noneOf(DayOfWeek.class);
  System.out.println(day.getClass());

  EnumSet<Character.UnicodeScript> scrpts = EnumSet.allOf(Character.UnicodeScript.class);
  System.out.println(scrpts
          .getClass()
          .getSuperclass()
          .getSuperclass()
          .getSuperclass()
          .getSuperclass());
}