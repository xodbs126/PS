package implement;

import java.util.Scanner;

public class ParkingTruck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution.solution(sc);

    }

    private static class Solution {
        public static void solution(Scanner sc) {
            int[] charges = new int[3];
            int result = 0;

            for (int i = 0; i < charges.length; i++) {
                charges[i] = sc.nextInt();
            }

            int[] times = new int[100];
            for (int i = 0; i < 3; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                for (int j = start - 1; j < end - 1; j++) {
                    times[j]++;
                }
            }

            for (int time : times) {
                if (time == 1) {
                    result += charges[0];
                }
                if (time == 2) {
                    result += charges[1]*2;
                }
                if (time == 3) {
                    result += charges[2] * 3;
                }
            }

            System.out.println(result);


        }
    }
}
