package no1;

import java.util.Scanner;

public class No1Sum {
    public static void main(String[] args) {
        // 입력 클래스 초기화
        Scanner sc = new Scanner(System.in);
        // N값 입력 받기
        int N = sc.nextInt(); // 길이 N의 숫자를 입력받아 String 형 변수 sNum에 저장하기
        String sNum = sc.next(); // sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
        char[] cNum = sNum.toCharArray(); // 오.. char은 아스키코드 값!

        // 계산하기
        int sum = 0; // int 형 변수 sum 선언하기
        for (char str : cNum) { // cNum 길이만큼 반복하기
            System.out.println(" 누적 sum: " + sum + " + str: " + str); // 디버깅 용 로그
            sum += str - '0'; // 아스키 코드 48인 '0'을 빼줘서 숫자 아스키 코드값으로 바꿔줌!! 미춌넹
        }
        System.out.println(sum); // sum 출력하기

        // 추가로 공부하기
        // string to int
        String test = "1235";
        /*
        * Q. parseInt, valueOf 두개 차이점
        * parseInt(): 원시데이터인 int 타입을 반환 (primitive type)
        * valueOf(): Integer 래퍼(wrapper)객체를 반환 (object type)
        * */
        int a1 = Integer.parseInt(test); // double, float, long, short 동일
        Integer a2 = Integer.valueOf(test);  // Double, Float, Long, Short 동일
        // int to string
        String b1 = Integer.toString(a1); // Double, Float, Long, Short 동일 & a1은 primitive type 이어야 한다.
        String b2 = String.valueOf(a2); // double, float, long, short 동일
    }
}
