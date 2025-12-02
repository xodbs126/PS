package implement;

import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution.solution(sc);

    }

    private static class Solution {
        public static void solution(Scanner sc) {
            int count = sc.nextInt();
            int result = 0;
            boolean[][] area = new boolean[100][100];
            for (int i = 0; i < count; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                for (int j = x; j < x + 10; j++) {
                    for (int k = y; k < y + 10; k++) {
                        area[j][k] = true;
                    }
                }
            }

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (area[i][j]) {
                        result++;
                    }
                }
            }

            System.out.println(result);

        }
    }
}
