package codetree.condition;

import java.util.HashMap;
import java.util.Map;
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
        * 3. 삼항 연산자 2
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a == 1? "t": "f");
        *
        * - if elif else 조건문 -
        * 1. 물의 상태
        *
        Scanner sc = new Scanner(System.in);
        int water = sc.nextInt();

        String state = "";
        if (water < 0) state = "ice";
        else if(water < 100) state = "water";
        else state = "vapor";

        System.out.println(state);
        *
        * 2. 시력 검사 2
        *
        Scanner sc = new Scanner(System.in);
        double eye = sc.nextDouble();

        System.out.println(eye >= 1.0? "High" : eye >= 0.5? "Middle" : "Low");
        *
        * 3. 살 수 있는 물건
        *
        Map<String, Integer> stuff = new HashMap<>() {{
            put("book", 3000);
            put("mask", 1000);
        }};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > stuff.get("book"))
            System.out.println("book");
        else if (n > stuff.get("mask"))
            System.out.println("mask");
        else System.out.println("no");
        *
        * */

    }
}