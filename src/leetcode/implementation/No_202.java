package leetcode.implementation;

import java.util.HashSet;
import java.util.Set;

public class No_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> alreadyExistNumber = new HashSet<>();
        while (!alreadyExistNumber.contains(n)) {
            alreadyExistNumber.add(n);

            int length = Integer.toString(n).length();
            if ((n = getSquareNumber(length, n)) == 1)
                return true;
        }
        return false;
    }

    public static int getSquareNumber(int length, int number) {
        int squareNumber = 0;

        for (int i = 1; i <= length; i++) {
            int digit = (int) ((number % Math.pow(10, i))/ Math.pow(10, i - 1));
            squareNumber += Math.pow(digit, 2);
        }

        return squareNumber;
    }
}
