package baekjoon.b5.p1439;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  private static String[] input;

  public static void main(String[] args) throws IOException {
    input = br.readLine().split("");
    int flag = -1;
    int one = 0;
    int zero = 0;
    for (int i = 0; i < input.length; i++) {
      if (input[i].equals("1")) {
        if (flag != 1) {
          one++;
        }
        flag = 1;
      } else {
        if (flag != 0) {
          zero++;
        }
        flag = 0;
      }
    }

    if (one <= zero) {
      bw.write(String.valueOf(one));
    } else {
      bw.write(String.valueOf(zero));
    }
    bw.flush();
    bw.close();
  }

}
