import java.util.*;

public class Main {
    static int N;
    static int[][] board;
    static Deque<int[]> snake = new ArrayDeque<>();

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            board[r][c] = 1;
        }

        int L = sc.nextInt();
        Queue<Move> moves = new LinkedList<>();
        for (int i = 0; i < L; i++) {
            int x = sc.nextInt();
            char c = sc.next().charAt(0);
            moves.offer(new Move(x, c));
        }

        int time = 0;
        int dir = 0;

        snake.offer(new int[]{0, 0});
        board[0][0] = 2;

        while (true) {
            time++;

            int[] head = snake.peekLast();
            int nr = head[0] + dr[dir];
            int nc = head[1] + dc[dir];

            if (nr < 0 || nr >= N || nc < 0 || nc >= N || board[nr][nc] == 2) {
                System.out.println(time);
                return;
            }


            if (board[nr][nc] == 1) {
                board[nr][nc] = 2;
                snake.offerLast(new int[]{nr, nc});
            } else {
                board[nr][nc] = 2;
                snake.offerLast(new int[]{nr, nc});
                int[] tail = snake.pollFirst();
                board[tail[0]][tail[1]] = 0;
            }

            if (!moves.isEmpty() && moves.peek().time == time) {
                Move m = moves.poll();
                if (m.dir == 'D') {
                    dir = (dir + 1) % 4;
                } else {
                    dir = (dir + 3) % 4;
                }
            }
        }
    }

    static class Move {
        int time;
        char dir;

        Move(int time, char dir) {
            this.time = time;
            this.dir = dir;
        }
    }
}
