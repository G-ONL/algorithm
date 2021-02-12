package baekjoon.b5.p1417;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  private static int N, target, count;
  private static Integer[] vote;
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bW = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    N = Integer.parseInt(br.readLine());
    target = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList();
    for (int i = 0; i < N - 1; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if (tmp >= target) {
        arr.add(tmp);
      }
    }
    count = 0;
    N = arr.size();
    vote = arr.stream().toArray(Integer[]::new);
    Arrays.sort(vote);

    while (N > 0 && vote[N - 1] >= target) {
      vote[N - 1]--;
      target++;
      count++;
      Arrays.sort(vote);
    }
    System.out.println(count);
  }

}
