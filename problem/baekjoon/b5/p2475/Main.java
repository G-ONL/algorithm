package baekjoon.b5.p2475;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//검증수
class Main {

  private static StringTokenizer st;
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    st = new StringTokenizer(br.readLine());

    int sum = 0;
    while (st.hasMoreTokens()) {
      int value = Integer.parseInt(st.nextToken());
      sum += (value * value) % 10;
    }

    bw.write(String.valueOf(sum % 10));
    bw.flush();
    bw.close();
  }
}
