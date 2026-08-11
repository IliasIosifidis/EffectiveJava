package chapter6_EnumsAndAnnotations.instanceFieldsInsteadOfOrdinals;

//Abuse of ordinal to derive an associated value -DONTDOTHIS!
 public enum Ensemble {
  SOLO, DUET, TRIO, QUARTET, QUINTET,
  SEXTET, SEPTET, OCTET, NONET, DECTET;

  public int numberOfMusicians() {return ordinal() + 1;}
}
