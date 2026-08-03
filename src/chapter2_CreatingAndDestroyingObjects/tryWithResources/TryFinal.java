package chapter2_CreatingAndDestroyingObjects.tryWithResources;

import java.io.*;

public class TryFinal {
  // try-finally - No longer the best way to close resources
  static String firstOfFile(String path) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(path));
    try {
      return br.readLine();
    } finally {
      br.close();
    }
  }
  static void copy(String src, String dst) throws IOException {
    InputStream in = new FileInputStream(src);
    final int BUFFER_SIZE = 166;
    try {
      OutputStream out = new FileOutputStream(dst);
      try {
        byte[] buf = new byte[BUFFER_SIZE];
        int n;
        while ((n = in.read(buf)) >= 0)
          out.write(buf, 0, n);
      } finally {
        out.close();
      }
    } finally {
      in.close();
    }
  }
}
