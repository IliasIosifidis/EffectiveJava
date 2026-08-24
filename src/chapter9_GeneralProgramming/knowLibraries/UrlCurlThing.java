package chapter9_GeneralProgramming.knowLibraries;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlCurlThing {
  // Printing the contents of a URL with transferTo, added in Java 9
  static void main(String[] args) throws IOException {
    try (InputStream in = new URL(args[0]).openStream()) {
      in.transferTo(System.out);
    }
  }
}
