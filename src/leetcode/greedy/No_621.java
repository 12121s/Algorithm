package leetcode.greedy;

import java.util.HashMap;
import java.util.Map;

public class No_621 {
    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B','C','C','C','D','D','D'}, 2));
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 0));
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B','A','A','C','C'}, 5));
        System.out.println(leastInterval(new char[]{'A','A','A','A','A','A','B','C','D','E','F','G'}, 2));
    }

    public static int leastInterval(char[] tasks, int n) {
        int maxTask = 0;
        Map<Character, Integer> taskMap = new HashMap<>();

        if (n == 0) return tasks.length;

        // count each task
        for (char task : tasks) {
            taskMap.merge(task, 1, Integer::sum);
            maxTask = Math.max(taskMap.getOrDefault(task, 0), maxTask);
        }

        int rest = (maxTask - 1) * (n + 1);

        // maxTask와 같은 갯수의 task가 존재하면 +1 씩 더해주기
        for(Integer e : taskMap.values()){
            if(e == maxTask) ++rest;
        }
        if(tasks.length >= rest)
            rest = tasks.length;

        return rest;
    }
}
