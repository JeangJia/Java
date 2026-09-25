package com.jeang.study.d_method;

import java.util.Random;

public class practice04 {
    /*
        学校选举学生会主席，有 5 个候选人
        全校 1000 名同学参与投票（每人一票，可以弃权，或者选 1-5 号）。
        投票使用 Random 模拟。0：弃权，1 ~ 5：给对应的候选人投票
        要求 1：统计每个候选人的得票数和得票率，找出得票最多的候选人？
        要求 2：统计弃票数和弃票率是多少？
      */
    public static void main(String[] args) {
        Random r = new Random();
        int[] sel = new int[5];
        int stu = 1000;
        int waive = 0;
        for (int i = 0; i < stu; i++) {
            int rand = r.nextInt(6);
            if (rand == 0) waive++;
            else sel[rand - 1]++;
        }
        System.out.println(" waive: " + waive + " " + (double) waive / stu);
        for (int i = 0; i < sel.length; i++) {
            System.out.println(" candidate " + (i + 1) + ": " + sel[i] + " " + (double) sel[i] / stu);
        }
    }
}
