package implement;

import java.util.Scanner;

public class ReadColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution.solution(sc);
    }

    private static class Solution {
        public static void solution(Scanner sc) {
            Character[][] arr = new Character[5][15];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 15; j++) {
                    arr[i][j] = '*';
                }
            }


            for (int i = 0; i < 5; i++) {
                String inputs = sc.nextLine();
                for (int j = 0; j < inputs.length(); j++) {
                    arr[i][j] = inputs.charAt(j);
                }
            }


            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 5; j++) {
                    if (arr[j][i] != '*') {
                        System.out.print(arr[j][i]);
                    }
                }
            }
        }
    }
}
