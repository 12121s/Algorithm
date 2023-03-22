package codetree.condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* - if 조건문
        * 1. 음수 구별하기
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(a);
        if (a < 0)
            System.out.println("minus");
        *
        * 2. 큰 수에서 빼기
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a,b) - Math.min(a,b));
        *
        * 3. 체질량 지수
        *
        Scanner sc = new Scanner(System.in);
        double height = sc.nextInt() / 100.0;
        int weight = sc.nextInt();

        double bmi = weight / (height * height);
        System.out.println((int)bmi);
        if (bmi >= 25)
            System.out.println("Obesity");
        *
        * 4. 정사각형의 넓이
        *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n*n);
        if (n < 5)
            System.out.println("tiny");
        *
        * - if else 조건문
        * 1. 시험 통과 여부 확인하기
        *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 80)
            System.out.println("pass");
        else System.out.println(80 - n  + " more score");
        *
        * 2. 숫자의 조건 여부
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 113)
            System.out.println("1");
        else System.out.println("0");
        *
        * 3. 비교에 따른 연산
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println(a * b);
        else System.out.println(b / a);
        *
        * - 삼항 연산자 -
        * 1. 2개 중 최대
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a,b));
        *
        * 2. 삼항 연산자
        *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = n == 100? "pass" : "failure";
        System.out.println(result);
        *
        * */
    }
}
