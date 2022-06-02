package no2;

import java.util.Scanner;

public class No2Avg {
    public static void main(String[] args) {
        // 입력 클래스 초기화
        Scanner sc = new Scanner(System.in);
        // N값 입력 받기
        int N = 0; // 길이 N의 숫자를 입력받아 String 형 변수 sNum에 저장하기
        try {
            N = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        sc.nextLine(); // 백준에서는 이거 안해야 통과됨;;
        String testScores = sc.nextLine(); // sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
        System.out.println("testScores : " + testScores);
//        System.out.println("testScores1 : " + testScores1);
        sc.close();

        String[] tScores = testScores.split("\\s+"); // 오.. char은 아스키코드 값!

        int max = 0;
        // 최대값 고르기
        for (String s : tScores) {
            int tScore = Integer.parseInt(s);
            if (tScore > max) {
                max = tScore;
            }
            System.out.println("score: " + s + ", max: " + max);
        }
        // 평균 계산하기
        float sum = 0f; // int 형 변수 sum 선언하기
        for (String score : tScores) { // cNum 길이만큼 반복하기
            float iScore = Float.parseFloat(score);
            sum += (iScore/max) * 100;
            System.out.println(" 누적 sum: " + sum + " + score: " + iScore); // 디버깅 용 로그
        }
        System.out.println("new Average: " + sum/N); // avg 출력하기
    }
}
