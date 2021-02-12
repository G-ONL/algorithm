package baekjoon.b5.p1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  private static int N, S;
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    N = Integer.parseInt(br.readLine());
    S = 666;
    int k = 1;
    int count = 0;
    while (true) {
      if (N == 1) {
        System.out.println(S);
        return;
      } else {
        S++;
        int s = S;
        count = 0;
        while (s > 0) {
          int mod = s % 10;
          if (mod == 6) {
            count++;
          } else {
            count = 0;
          }
          if (count == 3) {
            k++;
          }
          if (k == N) {
            System.out.println(S);
            return;
          }
          s /= 10;
        }

      }
    }


  }

}
