package leetcode.string;

public class No_43 {
    public static void main(String[] args) {
//        System.out.println(multiply("2","3"));
//        System.out.println(multiply("123","456"));
//        System.out.println(multiply("123456789","987654321"));
//        System.out.println(multiply("6913259244","71103343"));
        System.out.println(multiply("498828660196","840477629533"));
    }

    public static String multiply(String num1, String num2) {
        String s1 = new StringBuffer(num1).reverse().toString();
        String s2 = new StringBuffer(num2).reverse().toString();

        int[] m = new int[s1.length() + s2.length()];

        // Go from right to left in num1
        for (int i = 0; i < s1.length(); i++) {
            // Go from right to left in num2
            for (int j = 0; j < s2.length(); j++) {
                m[i + j] = m[i + j]
                        + (s1.charAt(i) - '0')
                        * (s2.charAt(j) - '0');
            }
        }

        StringBuilder product = new StringBuilder();
        // Multiply with current digit of first number
        // and add result to previously stored product
        // at current position.
        for (int i = 0; i < m.length; i++) {
            int digit = m[i] % 10;
            int carry = m[i] / 10;
            if (i + 1 < m.length) {
                m[i + 1] = m[i + 1] + carry;
            }
            product.insert(0, digit);
        }

        // ignore '0's from the right
        while (product.length() > 1
                && product.charAt(0) == '0') {
            product = new StringBuilder(product.substring(1));
        }

        // Check condition if one string is negative
        return product.toString();
    }


    /*public static String multiply(String str1, String str2) {
        Long num1 = Long.parseUnsignedLong(str1);
        Long num2 = Long.parseUnsignedLong(str2);

        System.out.println("num1: " + num1 + ", num2: " + num2);

        Long answer = karatsuba(num1, num2);

        return String.format("%d", answer);
    }

    public static Long karatsuba(Long num1, Long num2) {
        int maxLen = Math.max(String.valueOf(num1).length(), String.valueOf(num2).length());

        if (maxLen < 2)
            return num1 * num2;

        Long b = num1 >> maxLen;
        Long a = num1 - (b << maxLen);
        Long d = num2 >> maxLen;
        Long c = num2 - (d << maxLen);

        Long ac = karatsuba(a, c);
        Long bd = karatsuba(b, d);
        Long abcd = karatsuba(a + b, c + d);

        Long answer = ac + (abcd - ac - bd << maxLen) + (bd << 2 * maxLen);
        System.out.println("answer: " + answer);
        return answer;
    }*/

    /*public static long stringToLong(String str) {
        long num = 0;
        char num0 = '0';
        for (int i = 0; i < str.length(); i++) {
            num += (str.charAt(i) - num0) * Math.pow(10, str.length() - i - 1);
        }
        return num;
    }*/

}
