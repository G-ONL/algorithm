package algorithm;

public class IndexTree {

  private static int N, size;
  private static int[] tree;
  private static int[] data;

  public static void main(String[] args) {
    N = 15;
    data = new int[15];
    for (int i = 1; i <= N; i++) {
      data[i - 1] = i;
    }
    init();

    int answer = sum(1, 5);
    System.out.println(answer);
  }

  private static int sum(int startIdx, int endIdx) {
    int start = size + startIdx - 1;
    int end = size + endIdx - 1;
    int sum = 0;
    while (start < end) {

      if ((start & 1) == 1) {
        sum += tree[start];
        start++;
      }
      if ((end & 1) == 0) {
        sum += tree[end];
        end--;
      }

      start /= 2;
      end /= 2;
    }
    if (start == end) {
      sum += tree[start];
    }

    return sum;
  }

  private static void update(int idx, int value) {

    int changeIdx = size - 1 + idx;

    int diff = value - tree[changeIdx];
    tree[changeIdx] = value;
    while (changeIdx > 0) {
      changeIdx /= 2;
      tree[changeIdx] += diff;
    }
  }

  public static void init() {
    size = 1;
    for (; size < N; size *= 2) {
      ;
    }
    tree = new int[size * 2];
    for (int i = 0; i < N; i++) {
      tree[i + size] = data[i];
    }

    for (int i = size - 1; i > 0; i--) {
      tree[i] = tree[i * 2] + tree[i * 2 + 1];
    }
  }

}
