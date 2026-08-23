static void main() {
//    private final List<Cheese> cheesesInStock = ...;
/**
 * @return a list containing all of the cheeses in the shop,
 * or null if no cheeses are available for purchase.
 */
//    public List<Cheese> getCheeses() {
//      return cheesesInStock.isEmpty() ? null
//              : new ArrayList<>(cheesesInStock);
//    }

//  List<Cheese> cheeses = shop.getCheeses();
//  if (cheeses != null && cheeses.contains(Cheese.STILTON))
//    System.out.println("Jolly good, just the thing.");
//  }

  //The right way to return a possibly empty collection
//  public List<Cheese> getCheeses() {
//    return new ArrayList<>(cheesesInStock);
//  }

  // Optimization - avoids allocating empty collections
//  public List<Cheese> getCheeses() {
//    return cheesesInStock.isEmpty() ? Collections.emptyList()
//            : new ArrayList<>(cheesesInStock);
//  }

  //The right way to return a possibly empty array
//  public Cheese[] getCheeses() {
//    return cheesesInStock.toArray(new Cheese[0]);
//  }

  // Optimization - avoids allocating empty arrays
//  private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
//  public Cheese[] getCheeses() {
//    return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
//  }

  // Don’t do this - preallocating the array harms performance!
//  return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
}
