/*
 * Codeforces Problem 71A: Way Too Long Words
 * Problem URL: https://codeforces.com/contest/71/problem/A
 * Submission URL: https://codeforces.com/contest/71/submission/389164955
 * Solution #3 (Java 21)
 * Verdict: Accepted
 * Time: 281 ms
 * Memory: 1000 KB
 * Submission Date: 2026-09-02 06:54:15 UTC
 * Author: MetaryaJain
 */

import java.util.Scanner;

public class Main {
    // Helper method to process a single word
    private static String abbreviate(String word) {
        if (word.length() <= 10) {
            return word;
        }
        return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(abbreviate(sc.next()));
        }
    }
}
