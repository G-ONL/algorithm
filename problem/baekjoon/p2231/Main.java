package baekjoon.p2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

  static StringTokenizer ST;
  static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  static int number;
  static int result;

  public static void main(String[] args) throws IOException {
    //input
    input();

    //process
    process();

    //output
    output();
  }

  private static void input() throws IOException {
    number = Integer.parseInt(BR.readLine());

  }

  private static void process() {
    result = 0;
    for (int i = 1; i < number; i++) {

      int temp = i;
      int k = i;
      int namuzi = 0;
      while (k > 9) {
        namuzi += k % 10;
        k = k / 10;
      }
      namuzi += k;

      if (temp + namuzi == number) {
        result = temp;
        break;
      }
    }
  }

  private static void output() {
    System.out.println(result);
  }

}