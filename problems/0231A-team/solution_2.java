/*
 * Codeforces Problem 231A: Team
 * Problem URL: https://codeforces.com/contest/231/problem/A
 * Submission URL: https://codeforces.com/contest/231/submission/389166016
 * Solution #2 (Java 21)
 * Verdict: Accepted
 * Time: 500 ms
 * Memory: 1100 KB
 * Submission Date: 2026-09-02 08:10:31 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b + c >= 2) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}