package doit.no2;

import java.util.Scanner;

public class No2AvgError {
    public static void main(String[] args) {
        // 입력 클래스 초기화
        Scanner sc = new Scanner(System.in);
        // N값 입력 받기
        int N = sc.nextInt(); // 길이 N의 숫자를 입력받아 String 형 변수 sNum에 저장하기
        sc.nextLine();
        String testScores = sc.nextLine(); // sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
//        String testScores1 = sc.nextLine();
//        System.out.println("testScores : " + testScores);
//        System.out.println("testScores1 : " + testScores1);
        sc.close();

        String[] tScores = testScores.split("\\s+"); // 오.. char은 아스키코드 값!

        int max = 0;
        // 최대값 고르기
        for (String s : tScores) {
//            System.out.println("score: " + s + ", max: " + max);
            int tScore = Integer.parseInt(s);
            if (tScore > max) {
                max = tScore;
            }
        }
        // 평균 계산하기
        int sum = 0; // int 형 변수 sum 선언하기
        for (String score : tScores) { // cNum 길이만큼 반복하기
            int iScore = Integer.parseInt(score);
//            System.out.println(" 누적 sum: " + sum + " + score: " + iScore); // 디버깅 용 로그
            sum += iScore/max * 100;
        }
        System.out.println("new Average: " + sum/N); // avg 출력하기

        // 추가로 공부하기

    }
}
