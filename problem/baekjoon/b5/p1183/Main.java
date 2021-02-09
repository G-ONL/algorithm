package baekjoon.b5.p1183;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private static StringTokenizer st;
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static int[] S, A;
  private static int sum;

  public static void main(String[] args) throws IOException {
    int n = Integer.parseInt(br.readLine());
    S = new int[n];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int a = Integer.parseInt(st.nextToken());
      S[i] = s - a;
    }

    Arrays.sort(S);

    if (n % 2 != 0) {
      System.out.println(1);
    } else {
      System.out.println(Math.abs(S[n / 2] - S[(n / 2) - 1]) + 1);
    }


  }

}
