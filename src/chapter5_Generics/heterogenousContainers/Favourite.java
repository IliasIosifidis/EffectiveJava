void main() {
  // Typesafe heterogeneous container pattern - client
 Favourites f = new Favourites();
 f.putFavourite(String.class, "Java");
 f.putFavourite(Integer.class, 0xcafebabe);
 f.putFavourite(Class.class, Favourites.class);

 String favouriteString = f.getFavourite(String.class);
 int favouriteInteger = f.getFavourite(Integer.class);
 Class<?> favouriteClass = f.getFavourite(Class.class);
  System.out.printf("%s %x %s%n", favouriteString,favouriteInteger, favouriteClass.getName());
}

// Typesafe heterogeneous container pattern - API
public static class Favourites {
  private Map<Class<?>, Object> favourites = new HashMap<>();

  public <T> void putFavourite(Class<T> type, T instance){
    favourites.put(type, type.cast(instance));
  }

  public <T> T getFavourite(Class<T> type){
    return type.cast(favourites.get(type));
  };
}