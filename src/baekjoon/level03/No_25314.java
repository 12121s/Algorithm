package baekjoon.level03;

import java.util.Scanner;

public class No_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String intLong = "long ";
        int no = sc.nextInt();

        System.out.println(intLong.repeat(no / 4) + "int");
    }
}
