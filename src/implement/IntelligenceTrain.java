package implement;

import java.util.Scanner;

public class IntelligenceTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {
            int max = Integer.MIN_VALUE;
            int current = 0;

            while (true) {

                int output = sc.nextInt();
                int input = sc.nextInt();

                if (input <= 0) {
                    break;
                }
                current += input - output;
                max = Math.max(current, max);
            }

            System.out.println(max);
        }
    }
}
