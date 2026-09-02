/*
 * Codeforces Problem 4A: Watermelon
 * Problem URL: https://codeforces.com/contest/4/problem/A
 * Submission URL: https://codeforces.com/contest/4/submission/389163749
 * Solution #2 (Java 21)
 * Verdict: Accepted
 * Time: 530 ms
 * Memory: 900 KB
 * Submitted At: 2026-09-02 06:36:03 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int w = sc.nextInt();
            if (w > 2 && w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
