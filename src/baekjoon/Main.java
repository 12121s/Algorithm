package baekjoon;

import baekjoon.level01.*;
import baekjoon.level02.EarlierAlarm;
import baekjoon.level02.LeapYear;
import baekjoon.level02.Quadrant;

public class Main {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        // level 01
//        HelloWorld.printHello();
//        ArithOperation.printResult();
//        ChangeYear.printResult();
//        ChessPiece.printResult();
//        Remainder.printResult();
//        Digits3Multiply.printResult();
//        PrintAnimal.printResult();
        // level 02
//        LeapYear.printResult();
//        Quadrant.printResult();
        EarlierAlarm.printResult();

        // memory usage
        MemoryUseCheck.checkMemoryUse();

        // time check
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간 차이(ms) : "+secDiffTime);
    }
}