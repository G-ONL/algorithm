package baekjoon.b5.p1145;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static int answer;

  public static void main(String[] args) throws IOException {
    String[] input = br.readLine().split(" ");
    int[] m = new int[5];

    for (int i = 0; i < input.length; i++) {
      m[i] = Integer.parseInt(input[i]);
    }

    for (int i = 1; i < 1000000; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        if (i % m[j] == 0) {
          count++;
        }
      }
      if (count > 2) {
        answer = i;
        break;
      }
    }

    bw.write(String.valueOf(answer));
    bw.flush();
    bw.close();
  }

}
