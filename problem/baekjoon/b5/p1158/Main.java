package baekjoon.b5.p1158;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  private static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    boolean[] check = new boolean[N + 1];
    check[0] = true;
    sb.append("<");
    int cur = 1;
    for (int i = 0; i < N; i++) {
      int j = 1;
      while (j < K) {

        if (!check[cur]) {
          j++;
        }
        cur++;
        if (cur > N) {
          cur = 1;
        }
      }
      while (check[cur]) {
        cur++;
        if (cur > N) {
          cur = 1;
        }
      }
      check[cur] = true;
      if (i != N - 1) {
        sb.append(cur).append(", ");
      } else {
        sb.append(cur).append(">");
      }
    }

    System.out.println(sb.toString());


  }

}
