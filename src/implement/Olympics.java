package implement;

import java.util.Scanner;

public class Olympics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {

            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] countries = new int[N][4];

            int targetGold = 0;
            int targetSilver = 0;
            int targetBronze = 0;
            int rank = 1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 4; j++) {
                    countries[i][j] = sc.nextInt();
                }
                if (M == countries[i][0]) {
                    targetGold = countries[i][1];
                    targetSilver = countries[i][2];
                    targetBronze = countries[i][3];
                }
            }

            for (int i = 0; i < N; i++) {
                int gold = countries[i][1];
                int silver = countries[i][2];
                int bronze = countries[i][3];

                if (gold > targetGold ||
                        (gold == targetGold && silver > targetSilver) ||
                        (gold == targetGold && silver == targetSilver && bronze > targetBronze)) {
                    rank++;
                }
            }

            System.out.println(rank);
        }
    }
}
