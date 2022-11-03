package codetree.output;

public class Main {
    public static void main(String[] args) {
        /*
        - 기본 출력 -

        1. 문장 출력
        System.out.print("Hello");

        2. 문자열에 특수 문자 포함시키기
        System.out.print("He says \"It's a really simple sentence\".");

        3. 2줄 출력
        System.out.println("Hello");
        System.out.print("World");

        4. 숫자 출력
        System.out.print(3);

        5. 공백을 사이에 두고 출력
        System.out.print("3 5");

        6. 한줄 출력
        System.out.print("Let's go LeebrosCode!");

        7. 두줄 출력
        System.out.println("Hello students!");
        System.out.print("Welcome to LeebrosCode!");

        8. 다양하게 출력
        System.out.println("Total days in Year");
        System.out.println(365);
        System.out.println("Circumference rate");
        System.out.print(3.1415926535);

        - 변수와 자료형 -

        1. 변수와 자료형
        int x = 97;
        int y = 13;
        int minus = x - y;
        System.out.print(x + " - " + y + " = " + minus);

        2. 변수 선언하기
        int a = 3;
        char b = 'C';
        System.out.print(a + "\n" + b);

        3. 정수 선언하고 곱 출력
        int x = 26;
        int y = 5;
        System.out.print(x + " * " + y + " = " + (x*y));

        - 출력 형식 -

        1. 변수 출력하기
        int a = 3;
        char b = 'C';
        System.out.printf("%d...%s",a,b);

        2. 변수 출력하기 2
        int a = 3;
        char b = 'C';

        System.out.print(b + "!.....!" + a);

        3. 변수 출력하기 3
        int a = 1;
        int b = 2;
        char c = 'C';

        System.out.print(a + "->" + b + "->" + c);

        - 소수점 맞춰 출력하기 -
        1. 소수점 맞춰 출력하기
        int chu = 13;
        double dal = 0.165;

        System.out.printf("%d * %.6f = %.6f", chu, dal, chu*dal);

        2. 소수점 반올림하기
        double a = 25.352;

        System.out.printf("%.1f", a);

        3. 길이 단위 변환하기
        double ft_to_cm = 30.48;
        double mi_to_cm = 160934;

        System.out.printf("%.1fft = %.1fcm\n", 9.2, 9.2 * ft_to_cm);
        System.out.printf("%.1fmi = %.1fcm", 1.3, 1.3 * mi_to_cm);

        4. 두 실수의 곱
        double a = 5.26;
        double b = 8.27;

        System.out.printf("%.3f", a*b);

        - 변수 값 변경 -
        1. 변수 값 변경
        int a = 3;
        a = 6;

        System.out.print(a);

        2. 변수값 교체하기 4
        int a = 7;
        a = 4;
        System.out.print(a);

        3. 문자 변경하기
        char a = 'C';
        a = 'T';
        System.out.print(a);

        4. 다른 변수로부터 변수 값 변경
        int a = 5;
        int b = 3;
        a = b;

        System.out.println(a);
        System.out.print(b);

        5. 변수값 교체하기 5
        int a = 2;
        int b = 6;
        a = b;
        System.out.println(a);
        System.out.print(b);

        6. 정수 복사
        int a = 3;
        int b = 4;
        b = a;
        System.out.println(a + " " + b);
        System.out.print(a*b);

        *** 두 변수 값을 교환 ***
        1. 두 변수 값을 교환
        int a = 3;
        int b = 5;
        a = a + b - (b = a);

        System.out.println(a);
        System.out.print(b);

        2. 변수값 교체하기6
        int a = 2;
        int b = 5;
        a = a ^ b ^ (b = a);

        System.out.println(a);
        System.out.print(b);

        3. 데이터 교환
        int a = 5, b = 6, c = 7;
        a = a + b + c - (c = b) - (b = a);

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);

        4. 변수값 동시에 복사
        int a = 1, b = 2, c = 3;
        a = b = c;
        System.out.printf("%d %d %d", a, b, c);

        5. 변수값 복사하기 2
        int a = 5, b = 6, c = 7;
        a = b = c;
        System.out.printf("%d %d %d", a, b, c);

        6. 합을 복사하기
        int a = 1, b = 2, c = 3;
        a = b = c = a + b + c;

        System.out.printf("%d %d %d", a, b, c);

        */
    }
}