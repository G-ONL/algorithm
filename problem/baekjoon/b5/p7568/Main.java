package baekjoon.b5.p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

  static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
  static StringTokenizer ST;

  static List<People> peoples = new ArrayList<>();

  public static void main(String[] args) throws IOException {

    //input
    input();

    //process
    process();

    //output
    output();

  }

  private static void input() throws IOException {
    int num = Integer.parseInt(BR.readLine().trim());

    for (int i = 0; i < num; i++) {
      ST = new StringTokenizer(BR.readLine().trim());
      int kg = Integer.parseInt(ST.nextToken());
      int cm = Integer.parseInt(ST.nextToken());
      peoples.add(new People(cm, kg));
    }
  }

  private static void process() {
    for (People people : peoples) {
      for (People people2 : peoples) {
        if (people != people2) {
          if (people.cm < people2.cm && people.kg < people2.kg) {
            people.up();
          }
        }
      }
    }
  }

  private static void output() {
    for (People people : peoples) {
      System.out.println(people.cnt);
    }
  }

  static class People {

    int cm;
    int kg;
    int cnt;

    People(int cm, int kg) {
      this.cm = cm;
      this.kg = kg;
      this.cnt = 1;
    }

    void up() {
      cnt++;
    }

  }

}
