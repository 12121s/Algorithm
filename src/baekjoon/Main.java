package baekjoon;

import baekjoon.level01.*;

public class Main {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        // logic
//        HelloWorld.printHello();
//        ArithOperation.printResult();
//        ChangeYear.printResult();
//        ChessPiece.printResult();
        Remainder.printResult();

        // memory usage
        MemoryUseCheck.checkMemoryUse();

        // time check
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간 차이(ms) : "+secDiffTime);
    }
}