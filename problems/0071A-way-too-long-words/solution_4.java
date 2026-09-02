/*
 * Codeforces Problem 71A: Way Too Long Words
 * Problem URL: https://codeforces.com/contest/71/problem/A
 * Submission URL: https://codeforces.com/contest/71/submission/389165344
 * Solution #4 (Java 21)
 * Verdict: Accepted
 * Time: 265 ms
 * Memory: 800 KB
 * Submission Date: 2026-09-02 07:08:18 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            char[] word = scanner.next().toCharArray();
            int n = word.length;

            if (n > 10) {
                System.out.printf("%c%d%c%n", word[0], n - 2, word[n - 1]);
            } else {
                System.out.println(word);
            }
        }
    }
}