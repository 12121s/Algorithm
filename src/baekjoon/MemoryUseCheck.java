package baekjoon;

import java.text.DecimalFormat;

public class MemoryUseCheck {
    public static void checkMemoryUse() {
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        String[] s = { "bytes", "KB", "MB", "GB", "TB", "PB" };

        int idx = (int) Math.floor(Math.log(usedMemory) / Math.log(1024));
        DecimalFormat df = new DecimalFormat("#,###.##");
        double ret = ((usedMemory / Math.pow(1024, Math.floor(idx))));

        System.out.println(df.format(ret) + " " + s[idx]);
    }
}
