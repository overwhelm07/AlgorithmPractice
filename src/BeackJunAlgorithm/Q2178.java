package BeackJunAlgorithm;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * BFS
 * 미로찾기
 */
public class Q2178 {
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int maze[][] = new int[N][M];
        int cache[][] = new int[N][M];
        boolean visit[][] = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = str.charAt(j) - 48;
            }
        }

        int count = 1;
        cache[0][0] = count;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (true) {
            if (queue.isEmpty()) {
                System.out.println(cache[N - 1][M - 1]);
                return;
            }
            count++;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int tmp[] = queue.pop();
                int r = tmp[0];
                int c = tmp[1];
                //위로
                if (inRange(r-1, c) && maze[r - 1][c] == 1 && !visit[r - 1][c]) {
                    cache[r - 1][c] = count;
                    queue.add(new int[]{r - 1, c});
                    visit[r - 1][c] = true;
                }
                //아래
                if (inRange(r+1, c) && maze[r + 1][c] == 1 && !visit[r + 1][c]) {
                    cache[r + 1][c] = count;
                    queue.add(new int[]{r + 1, c});
                    visit[r + 1][c] = true;
                }
                //오른쪽
                if (inRange(r, c+1) && maze[r][c + 1] == 1 && !visit[r][c + 1]) {
                    cache[r][c + 1] = count;
                    queue.add(new int[]{r, c + 1});
                    visit[r][c + 1] = true;
                }
                //왼쪽
                if (inRange(r, c-1) && maze[r][c - 1] == 1 && !visit[r][c - 1]) {
                    cache[r][c - 1] = count;
                    queue.add(new int[]{r, c - 1});
                    visit[r][c - 1] = true;
                }
            }
        }
    }

    public static boolean inRange(int y, int x) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }
}
