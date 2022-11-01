package doit.no3;

import java.util.Scanner;

public class No3PartSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] NM = (sc.nextLine()).split("\\s+");
//        System.out.println("N: " + NM[0] + ", M: " + NM[1]);
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] Sums = new int[N];
        for (int i = 0; i < N; i++) {
            Sums[i] += (i > 0 ? Sums[i-1] : 0) + Integer.parseInt(sc.next()); // 아 i를 1부터 하면 0을 고려 안해도 되는구나..!
//            System.out.println(Sums[i]);
        }
        sc.nextLine();

        int[] Answers = new int[M];
        for (int k = 0; k < M; k++) {
            String[] ij = (sc.nextLine()).split("\\s+");
//            System.out.println("i: " + ij[0] + ", j: " + ij[1]);
            int i = Integer.parseInt(ij[0]);
            int j = Integer.parseInt(ij[1]);
            Answers[k] = Sums[j-1] - (i > 1? Sums[i - 2] : 0);
        }

        for (int i = 0; i < M; i++) {
            System.out.println(Answers[i]);
        }
        sc.close();
    }
}
