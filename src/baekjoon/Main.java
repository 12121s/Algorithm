package baekjoon;

import baekjoon.level01.*;
import baekjoon.level02.*;
import baekjoon.level03.*;
import baekjoon.level04.No_10807;
import baekjoon.level04.No_10818;
import baekjoon.level04.No_10871;

import java.io.IOException;

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
//        EarlierAlarm.printResult();
//        OvenAlarm.printResult();
//        DiceGame.printResult();
        // level 03
//        MultiplicationTable.printResult();
//        PlusTable.printResult();
//        PlusUntilN.printResult();
//        Receipt.printResult();
//        QuickPlusTable.printResult();
//        QuickPlusTable2.printResult();
//        PrintStar.printShortResult();
//        PrintStar.printResult();
//        PlusCycle.printResult();
//        No_10807.printResult();
//        No_10807.printFasterResult();
//        No_10871.printNFasterResult();
//        No_10818.printLoopResult();
        No_10818.printSortResult();

        // memory usage
        MemoryUseCheck.checkMemoryUse();

        // time check
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간 차이(ms) : "+secDiffTime);
    }
}