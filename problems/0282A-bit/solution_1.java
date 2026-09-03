/*
 * Codeforces Problem 282A: Bit++
 * Problem URL: https://codeforces.com/contest/282/problem/A
 * Submission URL: https://codeforces.com/contest/282/submission/389235346
 * Solution #1 (Java 21)
 * Verdict: Accepted
 * Time: 250 ms
 * Memory: 1600 KB
 * Submission Date: 2026-09-03 01:51:37 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for (int i = 0; i < n; i++) {
            String statement = sc.next();
            if (statement.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        System.out.println(x);
        sc.close();
    }
}