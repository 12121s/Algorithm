package baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_1697 {
    static int N;
    static int K;

    static int[] visited = new int[100001];

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            String[] inputs = input.split(" ");

            N = Integer.parseInt(inputs[0]);
            K = Integer.parseInt(inputs[1]);

            int result = bfs(N);
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int  bfs(int node)
    {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(node);
        int pos = 0; // 현재 위치
        visited[node] = 1;

        while (!queue.isEmpty())
        {
            pos = queue.remove();

            if (pos == K)
                return visited[pos]-1;
            if (pos-1>=0 && visited[pos-1] == 0) { // 좌표 > 0 & 한 번 방문했던 위치 다시 가지 않음.
                visited[pos-1] = visited[pos]+1;
                queue.add(pos-1);
            }
            if (pos+1 <= 100000 && visited[pos+1] == 0) {
                visited[pos+1] = visited[pos]+1;
                queue.add(pos+1);
            }
            if (2*pos <= 100000 && visited[2*pos] == 0) {
                visited[2*pos] = visited[pos] + 1;
                queue.add(2*pos);
            }
        }
        return -1;
    }
}
