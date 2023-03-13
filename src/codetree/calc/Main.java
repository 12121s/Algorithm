package codetree.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* - 사칙연산 -
        * 1. 간단한 사칙연산
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);
        *
        * 2. 길이 변형 후 사각형 넓이 구하기
        *
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt() + 8;
        int height = sc.nextInt() * 3;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);
        *
        * 3. 두 수의 곱과 몫
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " * " + b + " = " + a * b);
        System.out.println(a + " / " + b + " = " + a / b);
        *
        * 4. 몫과 나머지
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a/b + "..." + a%b);
        *
        * 5. 입력받아 연산하기
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + 87;
        int b = sc.nextInt() % 10;

        System.out.println(a);
        System.out.println(b);
        *
        * 6. 2개의 정수를 서로 더하기
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a += b; // b를 a에 더하기
        b += a; // a를 b에 더하기

        System.out.println(a + " " + b);
        *
        * 7. 출력 결과
        *
        float a;
        int b=3, c=2;
        a = b/c;
        System.out.printf("%.1f", a); // 1.5
        *
        * 8. 출력 결과 2
        *
        int a = 10;
        int b = 5;
        System.out.println((a%b) + " " + (a%(a%b))); // 오류 발생
        *
        * 9. 출력 결과 3
        *
        int a = 1;
        double b = 1.3;
        double c;
        c = a + b;
        System.out.printf("%.2f", c); // 2.30
        *
        * 10. 합과 차의 나눗셈
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%.2f", (float) (a + b) / (a - b));
        *
        * - 합과 평균 -
        * 1. 합과 평균
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %.1f", a + b, (float)(a + b) / 2);
        *
        * 2. 세 수의 합과 평균 구하기
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(sum(a,b,c));
        System.out.println(avg(a,b,c));
        *
        * 3. 합과 평균의 차
        *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = sum(a,b,c);
        int avg = avg(a,b,c);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);
        *
        * */

    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return sum;
    }

    public static int avg(int... nums) {
        return sum(nums) / nums.length;
    }
}
