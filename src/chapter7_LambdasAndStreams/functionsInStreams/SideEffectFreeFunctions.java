package chapter7_LambdasAndStreams.functionsInStreams;

import chapter6_EnumsAndAnnotations.enumsInsteadOfInts.Operation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static chapter4_ClassesAndInterfaces.minimizeAccessibility.MinimizeAccessibility.values;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toMap;

public class SideEffectFreeFunctions {
  // Uses the streams API but not the paradigm--Don't do this!
  Map<String, Long> freq = new HashMap<>();
//  try (Stream<String> words = new Scanner(file).tokens()){
//    words.forEach(word -> {
//      freq.merge(word.toLowerCase(), 1L, Long::sum);
//    });

  // Proper use of streams to initialize a frequency table
  Map<String, Long> freq2;
//  try (Stream<String> words = new Scanner(file).tokens()){
//    freq2 = words
//            .collect(groupingBy(String::toLowerCase, counting()));
//  }

  // Pipeline to get a top-ten list of words from a frequency table
  List<String> topTen = freq.keySet().stream()
          .sorted(comparing(freq::get).reversed())
          .limit(10)
          .toList();

  // Using a toMap collector to make a map from string to enum
  private static final Map<String, Operation> stringToEnum =
          Stream.of(values()).collect(
                  toMap(Object::toString, e -> (Operation) e)
          );

  // Collector to generate a map from key to chosen element for key
//  Map<Artist, Album> topHits = albums.collect(
//          toMap(Album::artist, a -> a, maxBy(comparing(Album::sales))));

  // Collector to impose last-write-wins policy
//  toMap(keyMapper, valueMapper, (v1, v2)->v2)
}
