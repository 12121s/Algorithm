package codetree.condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

        if (n >= stuff.get("book"))
            System.out.println("book");
        else if (n >= stuff.get("mask"))
            System.out.println("mask");
        else System.out.println("no");
        *
        * - if elif elif else 조건문
        * 1. 출석 부르기
        *
        String[] stu = new String[] {"John", "Tom", "Paul"};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= stu.length) {
            System.out.println(stu[num - 1]);
        } else System.out.println("Vacancy");
        *
        * 2. 등급 매기기
        *
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String grade = "";
        if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else grade = "F";
        System.out.println(grade);
        *
        * 3. 알파벳에 따른 평가
        *
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String result = switch (s) {
                case "S" -> "Superior";
                case "A" -> "Excellent";
                case "B" -> "Good";
                case "C" -> "Usually";
                case "D" -> "Effort";
                default -> "Failure";
            };
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        *
        * 4. 살 수 있는 물건 2
        *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 3000)
            System.out.println("book");
        else if (n >= 1000)
            System.out.println("mask");
        else if (n >= 500)
            System.out.println("pen");
        else System.out.println("no");
        *
        * - if if 조건문 -
        * 1. 최대 2번의 연산
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) a /= 2;
        if (a % 2 == 1) a = (a + 1) / 2;

        System.out.println(a);
        *
        * 2. 숫자의 조건 여부 2
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 5) System.out.println("A");
        if (a % 2 == 0) System.out.println("B");
        *
        * 3. 두 번의 연산
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 1) a += 3;
        if (a % 3 == 0) a /= 3;

        System.out.println(a);
        *
        * - if else if else 조건문 -
        * 1. 두 숫자의 짝홀 여부
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( a % 2 == 0? "even" : "odd");
        System.out.println( b % 2 == 0? "even" : "odd");
        *
        * 2. 특정 조건 두 정수 비교
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((a < b? 1 : 0) + " " + (a == b? 1 : 0));
        *
        * */


    }
}