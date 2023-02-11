package codetree.inoutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* - 정수 입력 -
        * 1. 입력받아 계산
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * System.out.print(a + 2);
        *
        * 2. 점수 입출력
        * Scanner sc = new Scanner(System.in);
        * int score = sc.nextInt();
        * System.out.printf("Your score is %d point.", score);
        *
        * 3. 입력받아 계산 4
        * Scanner sc= new Scanner(System.in);
        * int a = sc.nextInt();
        * System.out.print(a*2);
        *
        * 4. 정수 입력받아 계산
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * System.out.print((2 * a) + 3);
        *
        * - 실수 입력 -
        * 1. 실수 받아 그대로 출력
        * Scanner sc = new Scanner(System.in);
        * double a = sc.nextDouble();
        * System.out.printf("%.2f",a);
        *
        * 2. 길이 단위 환산하기
        * Scanner sc = new Scanner(System.in);
        * double ft = sc.nextDouble();
        * double cm = ft * 30.48;
        * System.out.printf("%.1f", cm);
        *
        * 3. 실수 입력받아 계산 2
        * Scanner sc = new Scanner(System.in);
        * double a = sc.nextDouble();
        * System.out.printf("%.2f", 1.5 + a);
        *
        * - 공백을 사이에 두고 입력 -
        * 1. 입력받아 계산 2
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        *
        * System.out.print(a * b);
        *
        * 2. 입력받아 계산 5
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * System.out.print(a + b);
        *
        * 3. 입력받은 값 교체하기
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        *
        * // swap
        * a = a ^ b ^ (b = a);
        * System.out.print(a + " " + b);
        *
        * 4. 입력받은 값과 합 출력
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * System.out.printf("%d %d %d", a, b, a+b);
        *
        * - 2개 줄에 걸쳐 입력 -
        * 1. 입력받아 계산 3
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * System.out.print(a * b);
        *
        * 2. 입력받아 출력
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * System.out.print(a + " " + b);
        *
        * 3. 실수 입력받아 계산
        * Scanner sc = new Scanner(System.in);
        * double a = sc.nextDouble();
        * double b = sc.nextDouble();
        *
        * System.out.printf("%.2f", a+b);
        *
        * 4. 세 실수의 반올림
        * Scanner sc = new Scanner(System.in);
        * double a = sc.nextDouble();
        * double b = sc.nextDouble();
        * double c = sc.nextDouble();
        *
        * System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);
        *
        * 5. 정수 세 개 입력받아 출력
        * Scanner sc = new Scanner(System.in);
        * int a = sc.nextInt();
        * int b = sc.nextInt();
        * int c = sc.nextInt();
        * System.out.printf("%d %d %d", a, b, c);
        *
        * - 문자, 문자열 입력 -
        * 1. 문자 받아 출력
        * Scanner sc = new Scanner(System.in);
        * String s = sc.next(); // 문자열 입력
        * char c = s.charAt(0); // 입력받은 문자열의 첫 번째 문자 추출
        * System.out.println(c);
        *
        * 2. 문자열 입력
        * Scanner sc = new Scanner(System.in);
        * String s = sc.next(); // 문자열 입력
        *
        * System.out.println(s);
        *
        * 3. 실수와 문자 받아 출력하기
        * Scanner sc = new Scanner(System.in);
        * String c = sc.next(); // 문자열 입력
        * double a = sc.nextDouble();
        * double b = sc.nextDouble();
        *
        * System.out.println(c);
        * System.out.printf("%.2f\n", a);
        * System.out.printf("%.2f", b);
        *
        * 4. 문자열 순서 바꾸기
        * Scanner sc = new Scanner(System.in);
        * String s = sc.next(); // 문자열 입력
        * String t = sc.next(); // 문자열 입력
        * String temp = "";
        *
        * temp = s;
        * s = t;
        * t = temp;
        *
        * System.out.println(s);
        * System.out.println(t);
        *
        * - 특정 문자를 사이에 두고 2개의 값을 입력 -
        * 1. 1시간 뒤 시간 출력
        * Scanner sc = new Scanner(System.in);
        * sc.useDelimiter(":"); // : 기준으로 잘라서 입력 받겠다는 뜻
        *
        * int h = sc.nextInt(); // : 기호가 나오기 전까지 입력 진행
        * int m = sc.nextInt(); // : 기호가 나오기 전 or 입력의 마지막 부분까지 진행
        * System.out.println(h + 1 + ":" + m);
        *
        * 2. 날짜 변경하여 출력 2
        * Scanner sc = new Scanner(System.in);
        * sc.useDelimiter("-"); // - 기준으로 잘라서 입력 받겠다는 뜻
        * int month = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        * int day = sc.nextInt(); // - 기호가 나오기 전까지 입력 진행
        * int year = sc.nextInt(); // - 기호가 나오기 전 or 입력의 마지막 부분까지 진행
        *
        * System.out.println(year + "." + month + "." + day);
        * */

    }
}
