package baekjoon.bfs;

public class No_1697 {

    public static void main(String[] args) {
        No_1697 st = new No_1697();

        System.out.println(st.solution(5, 17));
    }


    int position;
    int target;
    int second;
    public int solution(int N, int K) {
        second = 0;
        position = N;
        target = K;
        move(position);

        return second;
    }
    public void move(int position) {
        // 탈출 조건
        if (position == target) {
            second++;
            return;
        }

        // 수행 동작
        move(position * 2);
        move(position - 1);
        move(position + 1);
    }
}
