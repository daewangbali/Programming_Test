package org.problems.problem05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, M;
    static int[][] pond;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        N = 10;
        M = 10;
        pond = new int[N][M];

        //입력
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < M ; j++){
                pond[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        //출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                sb.append(pond[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < N ; i++){
            for(int j = 0; j < M; j++){
                if(pond[i][j] == 1){
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            int count = 0;
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (pond[nx][ny] >= pond[x][y]) {
                        count++;
                    }
                }
            }
            if(count == 4){
                pond[x][y]++;
                queue.offer(new int[]{x,y});
            }
        }
    }

}