/*
 * Codeforces Problem 4A: Watermelon
 * Problem URL: https://codeforces.com/contest/4/problem/A
 * Submission URL: https://codeforces.com/contest/4/submission/389163749
 * Solution #3 (Java 21)
 * Verdict: Accepted
 * Time: 530 ms
 * Memory: 900 KB
 * Submission Date: 2026-09-02 07:08:32 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int w = new Scanner(System.in).nextInt();
        System.out.println((w > 2 && (w & 1) == 0) ? "YES" : "NO");
    }
}