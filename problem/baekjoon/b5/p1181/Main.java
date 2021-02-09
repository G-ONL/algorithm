package baekjoon.b5.p1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  private static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    int N = Integer.parseInt(br.readLine());
    Set<String> wordSet = new HashSet<>();
    for (int i = 0; i < N; i++) {
      wordSet.add(br.readLine());
    }
    String[] words = wordSet.stream().toArray(String[]::new);

    Arrays.sort(words, (s, t1) -> {
      if (s.length() > t1.length()) {
        return 1;
      } else if (s.length() < t1.length()) {
        return -1;
      } else {
        int j = 0;
        while (j < s.length()) {
          if (s.charAt(j) > t1.charAt(j)) {
            return 1;
          } else if (s.charAt(j) < t1.charAt(j)) {
            return -1;
          }
          j++;
        }

      }
      return 0;
    });

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
  }
}
